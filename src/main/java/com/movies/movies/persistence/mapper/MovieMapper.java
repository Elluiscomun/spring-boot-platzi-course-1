package com.movies.movies.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.movies.movies.domain.dto.MovieDto;
import com.movies.movies.persistence.entity.MovieEntity;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "duracion", target = "duration")
    @Mapping(source = "genero", target = "genere")
    @Mapping(source = "fechaEstreno", target = "releaseDate")
    @Mapping(source = "clasificacion", target = "rating")
    MovieDto toDTO(MovieEntity movieEntity);
    List<MovieDto> toDTO(Iterable<MovieEntity> movieEntities);

}
