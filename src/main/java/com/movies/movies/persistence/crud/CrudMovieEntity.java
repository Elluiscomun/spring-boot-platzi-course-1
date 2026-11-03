package com.movies.movies.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.movies.movies.persistence.entity.MovieEntity;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long>{

}
