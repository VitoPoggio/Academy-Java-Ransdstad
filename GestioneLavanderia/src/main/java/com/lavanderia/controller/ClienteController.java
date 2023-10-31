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

import com.lavanderia.model.Cliente;
import com.lavanderia.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	ClienteService cs;
	
	@GetMapping
	public List<Cliente> getAll(){
		return cs.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> getById(@PathVariable Long id){
		return cs.findById(id);
	}
	
	@PostMapping
	public Cliente save(@RequestBody Cliente c) {
		return cs.saveCliente(c);
	}
	
	@PostMapping("/{id}")
	public Cliente update(@PathVariable Long id, @RequestBody Cliente c){
		c.setIdCliente(id);
		return cs.update(c);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		cs.deleteCliente(id);
	}
}
