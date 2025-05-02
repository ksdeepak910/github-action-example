package com.poc.gitaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello Deepak Kumar Sabat";
    }
}
