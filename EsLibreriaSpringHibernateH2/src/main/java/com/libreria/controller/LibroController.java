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
@RequestMapping("/libro")
public class LibroController {

	@Autowired
	LibroService lS;
	
	@Autowired
	AutoreService aS;
	
	@GetMapping
	public List<Libro> getAll(){
		return lS.getLibri();
	}
	
	@GetMapping("/{id}")
	public Optional<Libro> getById(@PathVariable Long id) {
		return lS.getLibroId(id);
	}
	
	@PostMapping
	public Libro saveLibro(@RequestBody Libro lib) {
		return lS.salvaLibro(lib);
	}
	
//	@PostMapping("/{id_libro}")
//	public Libro libroAutore (@PathVariable Long id_libro, @RequestBody Autore aut) {
//		aS.AutoreLibro(aut.getId(), id_libro);
//		return lS.libroAutore(id_libro, aut.getId());
//	}
	
	@PutMapping("/{id}")
	public Libro aggiornaLibro(@PathVariable Long id, @RequestBody Libro lib) {
		if (lS.getLibroId(id) != null)
			lS.salvaLibro(lib); //funziona o crea un altro id??
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void cancellaLibro(@PathVariable Long id) {
		lS.deleteLibro(id);
	}
	
	
}
