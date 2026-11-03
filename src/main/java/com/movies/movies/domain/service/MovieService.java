package com.movies.movies.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.movies.domain.dto.MovieDto;
import com.movies.movies.domain.repository.MovieRepository;

@Service 
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAll(){
        return this.movieRepository.getAll();
    }
}
