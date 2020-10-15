package com.example.entrevueSpringBoot.film.controller;

class FilmNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private Long filmId;
	
	FilmNotFoundException(Long filmId) {
		super("Film not found with id: " + filmId);
		setFilmId(filmId);
	}

	private void setFilmId(Long filmId) {
		this.filmId = filmId;
	}

	Long getFilmId() {
		return filmId;
	}
	
}
