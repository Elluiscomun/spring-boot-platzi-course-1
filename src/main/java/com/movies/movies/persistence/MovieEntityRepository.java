package com.movies.movies.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.movies.movies.domain.dto.MovieDto;
import com.movies.movies.domain.repository.MovieRepository;
import com.movies.movies.persistence.crud.CrudMovieEntity;
import com.movies.movies.persistence.mapper.MovieMapper;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return movieMapper.toDTO(this.crudMovieEntity.findAll());
    }

}
