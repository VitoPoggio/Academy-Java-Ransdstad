package com.libreria.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.model.Autore;
import com.libreria.model.Libro;
import com.libreria.service.AutoreService;
import com.libreria.service.LibroService;

@RestController
@RequestMapping("/autore")
public class AutoreController {
	
	@Autowired
	AutoreService aS;
	@Autowired
	LibroService lS;
	
	@GetMapping
	public List<Autore> getAll(){
		return aS.getAutori();
	}
	
	@GetMapping("/{id}")
	public Optional<Autore> getById(@PathVariable Long id) {
		return aS.getAutoreId(id);
	}
	
	@PostMapping
	public Autore saveAutore(@RequestBody Autore aut) {
		return aS.salvaAutore(aut);
	}
	
	/*
	 * @PostMapping("/{id_autore}") public Autore libroAutore (@PathVariable Long
	 * id_autore, @RequestBody Libro lib) { lS.libroAutore(lib.getId(), id_autore);
	 * return aS.AutoreLibro(id_autore, lib.getId());
	 * 
	 * }
	 */
	
	@PutMapping("/{id}")
	public Autore aggiornaLibro(@PathVariable Long id, @RequestBody Autore aut) {
		if (aS.getAutoreId(id) != null)
			aS.salvaAutore(aut); //funziona o crea un altro id??
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void cancellaAutore(@PathVariable Long id) {
		aS.deleteAutore(id);
	}
}
