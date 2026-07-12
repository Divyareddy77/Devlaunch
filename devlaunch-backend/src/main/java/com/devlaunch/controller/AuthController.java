package com.devlaunch.controller;

import com.devlaunch.dto.request.SignupRequest;
import com.devlaunch.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public String register(@Valid @RequestBody SignupRequest request){
        userService.register(request);
        return "user registered successfully";
    }
}
