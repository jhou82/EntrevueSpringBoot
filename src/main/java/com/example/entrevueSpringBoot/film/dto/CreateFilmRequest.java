package com.example.entrevueSpringBoot.film.dto;

import java.util.List;

import lombok.Data;

@Data
public class CreateFilmRequest {

	private String titre;
	private String description;
	private List<CreateActeurRequest> acteurs;
	
}
