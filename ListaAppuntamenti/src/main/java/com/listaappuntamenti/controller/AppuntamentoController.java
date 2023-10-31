package com.listaappuntamenti.controller;

import org.springframework.web.bind.annotation.RestController;

import com.listaappuntamenti.model.Appuntamento;
import com.listaappuntamenti.service.AppuntamentoService;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/appuntamenti")
public class AppuntamentoController {

	@Autowired
	private AppuntamentoService apService;
	
	@GetMapping
	public Collection<Appuntamento> listaAppuntamenti(){
		return apService.ottieniAppuntamenti();
	}
	
	@GetMapping("/{id}")
	public Appuntamento ottieniAppuntamentoId(@PathVariable Long id) {
		return apService.ottieniPerId(id);
	}
	
	@PostMapping
	public Appuntamento nuovoAppuntamento(@RequestBody Appuntamento ap) {
		return apService.aggiungiAppuntamento(ap);
	}
	
	@PutMapping("/{id}")
	public Appuntamento aggiornaAppuntamento(@PathVariable Long id, @RequestBody Appuntamento ap) {
		return apService.aggiornaAppuntamento(id, ap);
	}
	
	@DeleteMapping("/{id}")
	public void eliminaAppuntamento(@PathVariable Long id) {
		apService.eliminaAppuntamento(id);
	}
	
	
}
