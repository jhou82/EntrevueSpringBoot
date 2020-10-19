package com.example.entrevueSpringBoot.film.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevueSpringBoot.film.domain.Film;
import com.example.entrevueSpringBoot.film.dto.CreateFilmRequest;

@Mapper(componentModel = "spring", uses = {ActeurRequestMapper.class})
public interface FilmRequestMapper {
	
	@Mapping(target = "id", ignore = true)
	Film fromCreateFilmRequestToEntity(CreateFilmRequest createFilmRequest);

}
