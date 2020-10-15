package com.example.entrevueSpringBoot.film.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "films")
@Data
public class Film {
	
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "titre", nullable = true)
	private String titre;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Acteur> acteurs;

}
