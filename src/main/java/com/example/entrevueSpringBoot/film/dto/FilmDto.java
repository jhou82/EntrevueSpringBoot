package com.example.entrevueSpringBoot.film.dto;

import java.util.List;

import lombok.Data;

@Data
public class FilmDto {

	private Long id;
	private String titre;
	private String description;
	private List<ActeurDto> acteurs;
	
}
