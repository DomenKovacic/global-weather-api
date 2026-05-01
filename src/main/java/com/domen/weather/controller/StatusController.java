package com.domen.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class StatusController {

    @GetMapping("/api/v1/status")
    public Map<String, String> getStatus() {
        return Map.of(
                "app", "Global Weather API",
                "status", "UP",
                "version", "0.1.0",
                "message", "Weather API is running"
        );
    }
}