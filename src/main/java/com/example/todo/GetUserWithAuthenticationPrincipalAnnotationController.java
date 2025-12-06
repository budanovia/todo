/*package com.example.todo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetUserWithAuthenticationPrincipalAnnotationController {

    @GetMapping("/user")
    public String getUser(@AuthenticationPrincipal CustomUserDetails userDetails) {
        return "User Details: " + userDetails.getUsername();
    }
}*/