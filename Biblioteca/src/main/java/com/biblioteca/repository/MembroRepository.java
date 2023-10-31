package com.biblioteca.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Membro;
import com.biblioteca.model.Prenotazione;

@Repository
public class MembroRepository {
	private Map<Long, Membro> database = new HashMap<>();
	private Long currentId = 1L;
	
	public Collection<Membro> getMembri(){
		return database.values();
	}

	public Membro save(Membro membro) {
		membro.setId(currentId++);
		membro.setPrenotazioni(new ArrayList<Prenotazione>());
		database.put(membro.getId(), membro);
		return membro;
	}

	public Optional<Membro> findById(Long id) {
		return Optional.ofNullable(database.get(id));
	}

	public void delete(Membro membro) {
		database.remove(membro.getId());
	}
	
	public List<Prenotazione> getPrenotazioni(Long id) {
		return database.get(id).getPrenotazioni();
		//serve per fare nel service il controllo di quantità libri
	}
}
