package com.biblioteca.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.model.Membro;
import com.biblioteca.repository.MembroRepository;

@Service
public class MembroService {

	@Autowired
	MembroRepository mR;
	
	public Collection<Membro> getMembri(){
		return mR.getMembri();
	}

	public Membro aggiungiMembro(Membro m) {
		// fare controllo se esiste già un membro con stessa mail
		return mR.save(m);
	}

	public Optional<Membro> findById(Long id) {
		return mR.findById(id);
	}

	public void deleteMembro(Membro membro) {
		mR.delete(membro);
	}

}
