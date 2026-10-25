package com.course.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final IAService iaService;

    public HelloController(IAService iaService) {
        this.iaService = iaService;
    }

    @GetMapping("/")    
    public String hello(){
        return this.iaService.generateGreeting();
    }

}
