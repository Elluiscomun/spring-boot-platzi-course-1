package com.movies.movies.domain.repository;

import java.util.List;

import com.movies.movies.domain.dto.MovieDto;

public interface MovieRepository {
    List<MovieDto> getAll();
}
