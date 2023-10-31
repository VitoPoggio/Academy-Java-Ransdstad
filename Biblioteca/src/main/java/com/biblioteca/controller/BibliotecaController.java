package com.biblioteca.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.model.Libro;
import com.biblioteca.model.Membro;
import com.biblioteca.model.Prenotazione;
import com.biblioteca.service.LibroService;
import com.biblioteca.service.MembroService;
import com.biblioteca.service.PrenotazioneService;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

	@Autowired
	MembroService mS;
	
	@Autowired
	LibroService lS;
	
	@Autowired
	PrenotazioneService pS;
	
	
	
	// -----------MEMBRO-------
	@GetMapping("/membri")
	public Collection<Membro> getMembri(){
		return mS.getMembri();
	}
	
	@PostMapping("/membri")
	public Membro aggiungiMembro(@RequestBody Membro m) {
		return mS.aggiungiMembro(m);
	}
	
	
	//--------LIBRI------------
	
	@GetMapping("/libri")
	public Collection<Libro> getLibri(){
		return lS.getLibri();
	}
	
	@GetMapping("/libro{id}")
	public Libro getLibroId(@PathVariable Long id) {
		return lS.trovaLibroId(id);
	}
	
	@PostMapping("/libri")
	public Libro aggiungiLibro(@RequestBody Libro l) {
		return lS.aggiungiLibro(l);
	}
	
	@DeleteMapping("/libro{id}")
	public void eliminaLibro(@PathVariable Long id) {
		lS.eliminaLibro(lS.trovaLibroId(id));
	}
	
	
	//-----PRENOTAZIONI--------
	
	@GetMapping("/prenotazioni")
	public Collection<Prenotazione> getPrenotazione(){
		return pS.getPrenotazioni();
	}
	
	@PostMapping("/prenotazioni")
	public boolean aggiungiPrenotazione(@RequestBody ObjectNode obj) {
		return pS.prenotaLibro(obj.get("id_membro").asLong(), obj.get("id_libro").asLong());
	}
	
}
