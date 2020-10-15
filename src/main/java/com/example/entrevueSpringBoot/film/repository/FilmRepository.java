package com.example.entrevueSpringBoot.film.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entrevueSpringBoot.film.domain.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Long> {
	
}
