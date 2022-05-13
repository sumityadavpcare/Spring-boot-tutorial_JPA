package com.spring_project.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/d")
    public String HelloWorld(){
        String toReturn= "My First SpringBoot Project/KGF";
        return toReturn;
    }
}
