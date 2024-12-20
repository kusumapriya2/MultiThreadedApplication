package com.multithread.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async("taskExecutor")
    public void performTask(String taskName) {
        System.out.println("Task " + taskName + " started by " + Thread.currentThread().getName());
        try {
            // Simulate a long-running task
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + taskName + " completed by " + Thread.currentThread().getName());
    }
}
