package org.thainta.taskmanagement.service;

import org.springframework.http.ResponseEntity;
import org.thainta.taskmanagement.model.dto.response.LoginResponse;

public interface AuthService {
    public ResponseEntity<LoginResponse> login(String username, String password);
}
