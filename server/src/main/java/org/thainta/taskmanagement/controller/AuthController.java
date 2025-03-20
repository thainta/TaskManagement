package org.thainta.taskmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thainta.taskmanagement.model.dto.response.LoginResponse;
import org.thainta.taskmanagement.service.AuthService;

@RestController
@RequestMapping( "/auth")
public class AuthController {
    AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping(value = "/login")
    public ResponseEntity<LoginResponse> login(String username, String password){
        return authService.login(username, password);
    }
}
