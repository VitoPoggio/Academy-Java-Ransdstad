package com.lavanderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanderia.model.Ordine;
import com.lavanderia.repository.OrdineRepository;

@Service
public class OrdineService {

	@Autowired
	OrdineRepository or;

	public Ordine saveOrdine(Ordine o) {
		return or.save(o);
		
		//fare anche COSTO TOTALE con i costi dei servizi

	}

	public Ordine update(Ordine o) {
		if (or.findById(o.getIdOrdine()) != null)
			return or.save(null);
		return null;
	}

	public List<Ordine> getAll() {
		return or.findAll();
	}

	public Optional<Ordine> findById(Long id) {
		return or.findById(id);
	}

	// find by cliente Creare query apposita

	public void deleteOrdine(Long id) {
		or.deleteById(id);

	}
}
