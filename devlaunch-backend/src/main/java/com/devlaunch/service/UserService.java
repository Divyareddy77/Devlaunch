package com.devlaunch.service;

import com.devlaunch.dto.request.SignupRequest;
import com.devlaunch.dto.response.SignupResponse;
import com.devlaunch.entity.User;
import com.devlaunch.entity.enums.Role;
import com.devlaunch.exception.UserAlreadyExistsException;
import com.devlaunch.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService {
    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       BCryptPasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public SignupResponse register(SignupRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email already exists");

        }
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);
        user.setIsActive(true);
        userRepository.save(user);

        return new SignupResponse("User Registered Successfully");
    }
}
