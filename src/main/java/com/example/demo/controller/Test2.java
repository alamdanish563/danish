package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2 {
    @GetMapping("Test1")
    public String Test1(){
        return "Hello Danish";
    }
}
