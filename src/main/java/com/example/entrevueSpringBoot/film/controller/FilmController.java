package com.example.entrevueSpringBoot.film.controller;

import java.util.Optional;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entrevueSpringBoot.film.dto.CreateFilmRequest;
import com.example.entrevueSpringBoot.film.dto.FilmDto;
import com.example.entrevueSpringBoot.film.service.FilmService;

import lombok.extern.java.Log;

/**
 * 
 * @author jhou
 * 
 * Api avec 2 endpoints :
 * 	- GET /api/film{id}
 *  - POST /api/film
 *
 */
@RestController
@RequestMapping(value = "api/film")
@Log
class FilmController {

	@Autowired
	private FilmService filmService;

	@RequestMapping(value = "/{filmId}", method = RequestMethod.GET)
	FilmDto getFilm(@PathVariable Long filmId) {

		log.log(Level.INFO, "Execution getFilm - /api/film/{0}", filmId);

		Optional<FilmDto> filmDto = filmService.findFilmById(filmId);
		return filmDto.orElseThrow(() -> {
			log.log(Level.INFO, "Execution getFilm - Film {0} not found", filmId);
			return new FilmNotFoundException(filmId);
		});
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	FilmDto createFilm(@RequestBody CreateFilmRequest createFilmRequest) {

		log.log(Level.INFO, "Execution createFilm - /api/film - data : {0}", createFilmRequest.toString());

		return filmService.createFilm(createFilmRequest);
	}

}
