package com.lavanderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanderia.model.Servizio;
import com.lavanderia.repository.ServizioRepository;

@Service
public class ServizioService {
	@Autowired
	ServizioRepository sr;

	public Servizio saveServizio(Servizio s) {
		return sr.save(s);

	}

	public Servizio update(Servizio s) {
		if (sr.findById(s.getIdServizio()) != null)
			return sr.save(null);
		return null;
	}

	public List<Servizio> getAll() {
		return sr.findAll();
	}

	public Optional<Servizio> findById(Long id) {
		return sr.findById(id);
	}

	public void deleteServizio(Long id) {
		sr.deleteById(id);

	}
}
