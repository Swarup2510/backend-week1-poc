package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class HealthController {

    @GetMapping("/health")
    public Map<String,String> health() {
        return Map.of("status","UP");

    }

    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String,Object> request) {
        
        return request;
    }
    
    
}