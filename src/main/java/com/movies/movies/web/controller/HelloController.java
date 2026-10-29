package com.movies.movies.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movies.domain.service.AIService;

@RestController 
public class HelloController {
    private final String enviroment;
    private final AIService aiService;

    public HelloController(AIService aiService, @Value("${spring.profiles.active}") String enviroment) {
        this.aiService = aiService;
        this.enviroment = enviroment;   
    }

    @GetMapping("/")
    public String hello(){
        try{
            return this.aiService.generateGreeting();
        }catch (Exception e){
            return "Hola en el ambiente " + this.enviroment + ", Se genero un Error: " + e.getMessage();
        }
    }

}
