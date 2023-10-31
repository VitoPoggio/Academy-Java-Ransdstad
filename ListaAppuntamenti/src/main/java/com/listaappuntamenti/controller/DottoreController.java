package com.listaappuntamenti.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaappuntamenti.model.Appuntamento;
import com.listaappuntamenti.model.Dottore;
import com.listaappuntamenti.service.AppuntamentoService;
import com.listaappuntamenti.service.DottoreService;

@RestController
@RequestMapping("/doc")
public class DottoreController {

	@Autowired
	private DottoreService dS;
	@Autowired
	private AppuntamentoService aS;
	
	@GetMapping
	public Collection<Dottore> listaDottori(){
		return dS.getDottori();
	}
	
	/*
	 * @GetMapping("/{id}") public Appuntamento ottieniAppuntamentoId(@PathVariable
	 * Long id) { return apService.ottieniPerId(id); }
	 */
	
	@PostMapping
	public Dottore nuovoDottore(@RequestBody Dottore d) {
		return dS.aggiungiDottore(d);
	}
	
	@PostMapping("/add/{id}")
	public Dottore aggiungiAppuntamento(@RequestBody Appuntamento ap, @PathVariable Long id) {
		return dS.aggiungiAppuntamento(aS.ottieniPerId(ap.getId()), id);
	}
	
	@GetMapping("/{id}")
	public Dottore cercaDottoreId(@PathVariable Long id) {
		return dS.getDottId(id);
	}
	
	@PutMapping("/{id}")
	public Dottore aggiornaDottore(@PathVariable Long id, @RequestBody Dottore d) {
		return dS.aggiornaDottore(id, d);
	}
	
	/*
	 * @PutMapping("/{id}") public Appuntamento aggiornaAppuntamento(@PathVariable
	 * Long id, @RequestBody Appuntamento ap) { return
	 * apService.aggiornaAppuntamento(id, ap); }
	 */
	
	/*
	 * @DeleteMapping("/{id}") public void eliminaAppuntamento(@PathVariable Long
	 * id) { apService.eliminaAppuntamento(id); }
	 */
}
