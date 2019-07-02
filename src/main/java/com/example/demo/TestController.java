package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class TestController {

    @GetMapping("/greet/{name}")
    public String greetings(@PathVariable("name") String name) {
        return "Hello "+ name + " ! Its a great day!";
    }
}
