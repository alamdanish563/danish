package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test3 {
    @GetMapping("work")
    public String work(){
        return "Hello Java World";
    }
}
