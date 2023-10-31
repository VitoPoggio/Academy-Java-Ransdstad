package com.lavanderia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lavanderia.model.Cliente;
import com.lavanderia.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository cR;

	public Cliente saveCliente(Cliente c) {
		return cR.save(c);

	}

	public Cliente update(Cliente c) {
		if (cR.findById(c.getIdCliente()) != null)
			return cR.save(null);
		return null;
	}

	public List<Cliente> getAll() {
		return cR.findAll();
	}

	public Optional<Cliente> findById(Long id) {
		return cR.findById(id);
	}

	// FIND BY EMAIL creare query apposita

	public void deleteCliente(Long id) {
		cR.deleteById(id);

	}
}
