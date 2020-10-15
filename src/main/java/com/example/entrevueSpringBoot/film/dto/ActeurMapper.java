package com.example.entrevueSpringBoot.film.dto;

import org.mapstruct.Mapper;

import com.example.entrevueSpringBoot.film.domain.Acteur;

@Mapper(componentModel = "spring")
public interface ActeurMapper {

	ActeurDto toDto(Acteur acteur);
	
	Acteur toEntity(ActeurDto acteurDto);
	
}
