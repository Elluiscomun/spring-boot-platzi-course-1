package com.movies.movies.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movies.domain.dto.MovieDto;
import com.movies.movies.domain.service.MovieService;

@RestController 
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<MovieDto> getAll(){
        return this.movieService.getAll();
    }
}
