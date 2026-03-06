package com.example.learningSpringBootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorkd {
    @GetMapping( "/")
    public String hello(){
        return "Hello world from prapti";
    }
}
