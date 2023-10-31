package com.listaappuntamenti.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.listaappuntamenti.model.Appuntamento;

@Service
public class AppuntamentoService {
	private final Map<Long, Appuntamento> appuntamenti = new HashMap<>();
	private Long currentId = 1L;

	// Metodo aggiunta Appuntamento
	public Appuntamento aggiungiAppuntamento(Appuntamento ap) {
		//currentId=(long) appuntamenti.size(); nell'eventualità
		ap.setId(currentId++);
		appuntamenti.put(ap.getId(), ap);
		return ap;
	}

	// Metodo per ottenere appuntamenti
	public Collection<Appuntamento> ottieniAppuntamenti() {
		return appuntamenti.values();
	}

	// Metodo per ottenere un appuntamento specifico per id
	public Appuntamento ottieniPerId(Long id) {
		return appuntamenti.get(id);
	}

	// Metodo per aggiornare un Appuntamento
	public Appuntamento aggiornaAppuntamento(Long id, Appuntamento ap) {
		if (appuntamenti.containsKey(id)) {
			ap.setId(id);
			appuntamenti.put(id, ap);
			return ap;
		}
		return null;
	}

	// Metodo per eliminare appuntamento
	public void eliminaAppuntamento(Long id) {
		appuntamenti.remove(id);
	}

}
