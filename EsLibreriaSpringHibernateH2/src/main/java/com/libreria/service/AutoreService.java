package com.libreria.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.model.Autore;
import com.libreria.model.Libro;
import com.libreria.repository.AutoreRepository;
import com.libreria.repository.LibroRepository;

@Service
public class AutoreService {
	
	@Autowired
	AutoreRepository aR;
	
	@Autowired
	LibroRepository lR;
	
	public Autore salvaAutore(Autore aut) {
		return aR.save(aut);
	}
	
	public Optional<Autore> getAutoreId (Long id) {
		return aR.findById(id);
	}
	
	public List<Autore> getAutori(){
		return aR.findAll();
	}
	
	public void deleteAutore(Long id) {
		aR.delete(getAutoreId(id).get());
	}
	
//	public Autore AutoreLibro(Long id_autore, Long id_Libro) {
//		Autore aut = getAutoreId(id_autore).get();
//		Set<Libro> lib = aut.getLibri();
//		lib.add(lR.findById(id_Libro).get());
//		return aR.save(aut);
//		
//	}

}
