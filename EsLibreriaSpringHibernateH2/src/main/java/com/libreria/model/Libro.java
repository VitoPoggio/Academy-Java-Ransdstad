package com.libreria.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Libro {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idLibro;
	private String titolo;
	
	@OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<LibroAutore> la = new HashSet<LibroAutore>();

	
	
	
}
