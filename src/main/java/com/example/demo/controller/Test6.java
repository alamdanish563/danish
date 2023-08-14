package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test6 {
    @GetMapping("work3")
    public String work3(){
        return "Good Morning";
    }
    
}
