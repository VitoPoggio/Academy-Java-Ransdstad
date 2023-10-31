package com.listaappuntamenti.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.listaappuntamenti.model.Appuntamento;
import com.listaappuntamenti.model.Dottore;

@Service
public class DottoreService {

	private final Map<Long, Dottore> dottori = new HashMap<>();
	private Long currentId = 1L;

	// aggiunge un nuovo dottore
	public Dottore aggiungiDottore(Dottore d) {
		d.setId(currentId++);
		dottori.put(d.getId(), d);
		return d;
	}

	// Lista dottori disponibili
	public Collection<Dottore> getDottori() {
		return dottori.values();
	}

	public Dottore getDottId(Long id) {
		return dottori.get(id);
	}

	public Dottore aggiornaDottore(Long id, Dottore d) {
		if (dottori.containsKey(id)) {
			d.setId(id);
			dottori.put(id, d);
			return d;
		}
		return null;

	}
	
	public void eliminaDottore(Long id) {
		dottori.remove(id);
	}

	// aggiungi appuntamento a dottore(id)
	public Dottore aggiungiAppuntamento(Appuntamento ap, Long id) {
		Dottore doc = dottori.get(id);
		List<Appuntamento> appuntamenti = doc.getAppuntamenti();
		appuntamenti.add(ap);
		doc.setAppuntamenti(appuntamenti);
		dottori.put(id, doc);
		return doc;
	}
	
	//RIMUOVI APPUNTAMENTO

}
