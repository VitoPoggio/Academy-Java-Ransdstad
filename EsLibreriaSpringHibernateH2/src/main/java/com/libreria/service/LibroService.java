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
public class LibroService {
	
	@Autowired
	LibroRepository lR;
	@Autowired
	AutoreRepository aR;
	
	public Libro salvaLibro(Libro lib) {
		return lR.save(lib);
	}
	
	public Optional<Libro> getLibroId (Long id) {
		return lR.findById(id);
	}
	
	public List<Libro> getLibri(){
		return lR.findAll();
	}
	
	public void deleteLibro(Long id) {
		lR.delete(getLibroId(id).get());
	}
	
//	public Libro libroAutore(Long id_libro, Long id_autore) {
//		Libro lib = getLibroId(id_libro).get();
//		Set<Autore> set = lib.getAutori();
//		set.add(aR.findById(id_autore).get());
//		return lR.save(lib);
//		
//	}
}
