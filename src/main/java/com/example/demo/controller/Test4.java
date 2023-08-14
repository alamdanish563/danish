package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("work1")
public class Test4 {
    @GetMapping("work1")
    public String work1(){
        return "Hello Java Friend";
    }
    
}
