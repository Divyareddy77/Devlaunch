package com.devlaunch.controller;

import com.devlaunch.dto.request.LoginRequest;
import com.devlaunch.dto.request.SignupRequest;
import com.devlaunch.dto.response.LoginResponse;
import com.devlaunch.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userService;


    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@Valid @RequestBody SignupRequest request){
        userService.register(request);
        return "user registered successfully";
    }


    @PostMapping("/login")
    public LoginResponse login(@Valid @RequestBody LoginRequest request) {

        return userService.login(request);

    }
}
