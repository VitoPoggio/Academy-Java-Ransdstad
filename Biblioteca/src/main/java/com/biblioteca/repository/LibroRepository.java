package com.biblioteca.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.biblioteca.model.Libro;

@Repository
public class LibroRepository {

	private Map<Long, Libro> database = new HashMap<>();
	private Long currentId = 1L;

	public Libro save(Libro libro) {
		libro.setId(currentId++);
		database.put(libro.getId(), libro);
		return libro;
	}

	public Optional<Libro> findById(Long id) {
		return Optional.ofNullable(database.get(id));
	}

	public void delete(Libro libro) {
		database.remove(libro.getId());
	}
	
	public Collection<Libro> getLibri(){
		return database.values();
	}
	
	public void updateQta(Long id, int qta) {
		database.get(id).setQuantitàDisponibile(database.get(id).getQuantitàDisponibile()+qta);
		
	}
	
	public boolean diminuisciQta(Long id) {
		if (database.get(id).getQuantitàDisponibile()>0) {
			database.get(id).setQuantitàDisponibile(database.get(id).getQuantitàDisponibile()-1);
			return true;
		}
		return false;
	}

	// Altri metodi CRUD...
}
