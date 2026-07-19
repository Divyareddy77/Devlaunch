package com.devlaunch.service;

import com.devlaunch.dto.request.LoginRequest;
import com.devlaunch.dto.request.SignupRequest;
import com.devlaunch.dto.request.UpdateProfileRequest;
import com.devlaunch.dto.response.LoginResponse;
import com.devlaunch.dto.response.ProfileResponse;
import com.devlaunch.dto.response.SignupResponse;
import com.devlaunch.entity.User;
import com.devlaunch.entity.enums.Role;
import com.devlaunch.exception.InvalidPasswordException;
import com.devlaunch.exception.UserAlreadyExistsException;
import com.devlaunch.exception.UserNotFoundException;
import com.devlaunch.repository.UserRepository;
import com.devlaunch.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    public SignupResponse register(SignupRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new UserAlreadyExistsException("Email already exists");

        }
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole(Role.USER);
        user.setIsActive(true);
        userRepository.save(user);

        return new SignupResponse("User Registered Successfully");
    }
    public LoginResponse login(LoginRequest request){
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() ->
                        new UserNotFoundException("User not found"));

        if (!passwordEncoder.matches(
                request.getPassword(),
                user.getPassword())) {

            throw new InvalidPasswordException("Invalid password");
        }

        String token = jwtService.generateToken(user);

        return new LoginResponse(token);
    }
    public ProfileResponse getProfile(String email) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found"));

        return new ProfileResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getLocation(),
                user.getBio(),
                user.getRole().name()
        );
    }
    public ProfileResponse updateProfile(
            String email,
            UpdateProfileRequest request) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found"));

        user.setName(request.getName());
        user.setPhone(request.getPhone());
        user.setLocation(request.getLocation());
        user.setBio(request.getBio());

        userRepository.save(user);

        return new ProfileResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getLocation(),
                user.getBio(),
                user.getRole().name()
        );
    }
}
