package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test10 {
    @GetMapping("work8")
    public String work8(){
        return "work 8";
    }
    
}
