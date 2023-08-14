package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test7 {
    @GetMapping("work6")
    public String work6(){
        return "Hello Java member";
    }
}
