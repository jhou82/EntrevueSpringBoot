package com.example.entrevueSpringBoot.film.mapping;

import org.mapstruct.Mapper;

import com.example.entrevueSpringBoot.film.domain.Film;
import com.example.entrevueSpringBoot.film.dto.FilmDto;

@Mapper(componentModel = "spring", uses = {ActeurMapper.class})
public interface FilmMapper {

	FilmDto fromEntityToFilmDto(Film film);
	
}
