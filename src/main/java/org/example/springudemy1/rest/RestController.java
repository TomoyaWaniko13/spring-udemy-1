package org.example.springudemy1.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    //    expose '/' that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "HELLO WORLD!";
    }
}
