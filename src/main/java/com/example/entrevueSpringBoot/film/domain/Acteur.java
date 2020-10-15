package com.example.entrevueSpringBoot.film.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "acteurs")
@Data
public class Acteur {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "nom", nullable = true)
	private String nom;
	
	@Column(name = "prenom", nullable = true)
	private String prenom;
	
}
