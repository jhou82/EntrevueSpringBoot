package com.example.entrevueSpringBoot.film.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entrevueSpringBoot.film.domain.Film;
import com.example.entrevueSpringBoot.film.dto.FilmDto;
import com.example.entrevueSpringBoot.film.dto.FilmMapper;
import com.example.entrevueSpringBoot.film.repository.FilmRepository;

@Service
class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@Autowired
	private FilmMapper filmMapper;

	@Override
	public Optional<FilmDto> findFilmById(Long id) {
		
		Optional<Film> film = filmRepository.findById(id);
		
		return film.flatMap(f -> {
			FilmDto filmDto = filmMapper.toDto(f);
			return Optional.of(filmDto);
		});

	}

	@Override
	public FilmDto saveFilm(FilmDto filmDto) {
		
		Film filmEntity = filmMapper.toEntity(filmDto);
		Film savedFilm = filmRepository.save(filmEntity);
		return filmMapper.toDto(savedFilm);
		
	}

}
