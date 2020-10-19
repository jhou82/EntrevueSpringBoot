package com.example.entrevueSpringBoot.film.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.entrevueSpringBoot.film.domain.Acteur;
import com.example.entrevueSpringBoot.film.dto.CreateActeurRequest;

@Mapper(componentModel = "spring")
public interface ActeurRequestMapper {

	@Mapping(target = "id", ignore = true)
	Acteur fromCreateActeurRequestToEntity(CreateActeurRequest createActeurRequest);
	
}
