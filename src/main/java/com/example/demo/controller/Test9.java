package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test9 {
    @GetMapping("work9")
    public String work9(){
        return "Heloo work9";
    }
    
}
