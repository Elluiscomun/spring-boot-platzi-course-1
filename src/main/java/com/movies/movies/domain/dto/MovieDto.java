package com.movies.movies.domain.dto;

import java.time.LocalDate;

public record MovieDto(
    String title,
    Integer duration,
    String genere,
    LocalDate releaseDate,
    Double rating
) {

}
