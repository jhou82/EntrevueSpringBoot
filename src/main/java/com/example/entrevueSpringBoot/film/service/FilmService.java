package com.example.entrevueSpringBoot.film.service;

import java.util.Optional;

import com.example.entrevueSpringBoot.film.dto.FilmDto;

public interface FilmService {
	
	public Optional<FilmDto> findFilmById(Long id);

	public FilmDto saveFilm(FilmDto filmDto);
	
}
