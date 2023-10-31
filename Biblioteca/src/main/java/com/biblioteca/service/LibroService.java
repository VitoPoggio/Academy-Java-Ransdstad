package com.biblioteca.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.model.Libro;
import com.biblioteca.repository.LibroRepository;

@Service
public class LibroService {
	
	@Autowired
	LibroRepository lr;
	
	public Collection<Libro> getLibri(){
		return lr.getLibri();
	}
	
	public void eliminaLibro(Libro l) {
		lr.delete(l);
	}
	
	public Libro aggiungiLibro(Libro l) {
		for(Libro lib : lr.getLibri()) {
			if(lib.compareLibro(l)==true) {
				lr.updateQta(lib.getId(), l.getQuantitàDisponibile());
				return l;
			}
		}
		lr.save(l);
		return l;
	}
	
	public boolean prenotaLibro(Long id_libro) {
		return lr.diminuisciQta(id_libro); //andrebbe fatto il controllo e mandare errore
	}
	
	public Libro trovaLibroId(Long id) {
		return lr.findById(id).get();
	}
	
	
}
