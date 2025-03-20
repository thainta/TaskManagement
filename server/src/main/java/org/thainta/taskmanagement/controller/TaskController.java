package org.thainta.taskmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/task")
public class TaskController {

    @GetMapping(value = "/getAllTask")
    public ResponseEntity<String> getAllTask(){
        return ResponseEntity.ok("aaaa");
    }
}
