package com.example.entrevueSpringBoot.film.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

import com.example.entrevueSpringBoot.film.domain.Acteur;
import com.example.entrevueSpringBoot.film.dto.ActeurDto;

@Mapper(componentModel = "spring")
@Named("ActeurMapper")
public interface ActeurMapper {

	ActeurDto fromEntityToActeurDto(Acteur acteur);
		
}
