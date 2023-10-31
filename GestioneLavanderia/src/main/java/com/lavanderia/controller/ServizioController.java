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

import com.lavanderia.model.Servizio;
import com.lavanderia.service.ServizioService;

@RestController
@RequestMapping("/servizio")
public class ServizioController {

	@Autowired
	ServizioService ss;
	
	@GetMapping
	public List<Servizio> getAll(){
		return ss.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Servizio> getById(@PathVariable Long id){
		return ss.findById(id);
	}
	
	@PostMapping
	public Servizio save(@RequestBody Servizio s) {
		return ss.saveServizio(s);
	}
	
	@PostMapping("/{id}")
	public Servizio update(@PathVariable Long id, @RequestBody Servizio s){
		s.setIdServizio(id);
		return ss.update(s);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		ss.deleteServizio(id);
	}
}
