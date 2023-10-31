package com.lavanderia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lavanderia.model.Ordine;
import com.lavanderia.service.OrdineService;

@RestController
@RequestMapping("/ordine")
public class OrdineController {

	@Autowired
	OrdineService os;

	@GetMapping
	public List<Ordine> getAll() {
		return os.getAll();
	}

	@GetMapping("/{id}")
	public Optional<Ordine> getById(@PathVariable Long id) {
		return os.findById(id);
	}

	//Aggiungere un modo per poter inserire pure i servizi e il cliente magari con un String[] o Long[]
	@PostMapping
	public Ordine save(@RequestBody Ordine o) {
		return os.saveOrdine(o);
	}

	@PostMapping("/{id}")
	public Ordine update(@PathVariable Long id, @RequestBody Ordine o) {
		o.setIdOrdine(id);
		return os.update(o);

	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		os.deleteOrdine(id);
	}
}
