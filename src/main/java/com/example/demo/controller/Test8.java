package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test8 {
    @GetMapping("work5")
    public String work5(){
        return "Hello world 5";
    }
}
