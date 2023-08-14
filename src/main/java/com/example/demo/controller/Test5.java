package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test5 {
    @GetMapping("work2")
    public String work2(){
        return "Good Evening";
    }
    
}
