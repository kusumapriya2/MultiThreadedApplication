package com.multithread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.multithread.service.AsyncService;

@RestController
public class TaskController {

    @Autowired
    private AsyncService asyncService; // TaskService is your service class

    @GetMapping("/start-tasks")
    public String startTasks(@RequestParam(defaultValue = "5") int taskCount) {
        for (int i = 1; i <= taskCount; i++) {
            asyncService.performTask("Task-" + i);
        }
        return taskCount + " tasks started!";
    }
}
