package com.devlaunch.controller;

import com.devlaunch.dto.request.UpdateProfileRequest;
import com.devlaunch.dto.response.ProfileResponse;
import com.devlaunch.security.CustomUserDetails;
import com.devlaunch.service.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProfileController {
    private final UserService userService;

    public ProfileController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public ProfileResponse getProfile(
            @AuthenticationPrincipal CustomUserDetails user) {

        return userService.getProfile(user.getUsername());
    }
    @PutMapping("/profile")
    public ProfileResponse updateProfile(
            @AuthenticationPrincipal CustomUserDetails user,
            @RequestBody UpdateProfileRequest request) {

        return userService.updateProfile(
                user.getUsername(),
                request
        );
    }
}
