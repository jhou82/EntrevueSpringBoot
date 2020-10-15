package com.example.entrevueSpringBoot.film.dto;

import org.mapstruct.Mapper;

import com.example.entrevueSpringBoot.film.domain.Film;

@Mapper(componentModel = "spring", uses = {ActeurMapper.class})
public interface FilmMapper {

	FilmDto toDto(Film film);
	
	Film toEntity(FilmDto filmDto);
	
}
