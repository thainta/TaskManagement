package org.thainta.taskmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/task")
public class TaskController {

    @GetMapping(value = "/getAllTask")
    public String getAllTask(){
        return "getAllTask";
    }
}
