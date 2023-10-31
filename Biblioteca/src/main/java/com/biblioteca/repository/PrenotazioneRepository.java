package com.biblioteca.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.biblioteca.model.Prenotazione;

@Repository
public class PrenotazioneRepository {
	private Map<Long, Prenotazione> database = new HashMap<>();
	private Long currentId = 1L;

	public Collection<Prenotazione> getPrenotazioni(){
		return database.values();
	}
	
	public Prenotazione save(Prenotazione prenotazione) {
		prenotazione.setId(currentId++);
		database.put(prenotazione.getId(), prenotazione);
		return prenotazione;
	}

	public Optional<Prenotazione> findById(Long id) {
		return Optional.ofNullable(database.get(id));
	}

	public void delete(Prenotazione prenotazione) {
		database.remove(prenotazione.getId());
	}

	// Altri metodi CRUD...
}
