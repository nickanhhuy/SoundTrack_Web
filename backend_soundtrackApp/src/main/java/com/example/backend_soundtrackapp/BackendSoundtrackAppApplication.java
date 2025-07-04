package com.example.backend_soundtrackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendSoundtrackAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendSoundtrackAppApplication.class, args);
    }

    @GetMapping("/api/health-check")
    public String healthCheck() {
        return "OK";
    }
}
