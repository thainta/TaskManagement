package org.thainta.taskmanagement.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.thainta.taskmanagement.model.dto.response.LoginResponse;
import org.thainta.taskmanagement.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public ResponseEntity<LoginResponse> login(String username, String password) {
        LoginResponse authResponse = new LoginResponse();
        authResponse.setToken("token");
        return ResponseEntity.ok().body(authResponse);
    }
}
