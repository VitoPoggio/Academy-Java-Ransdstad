package com.lavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanderia.model.Servizio;

public interface ServizioRepository extends JpaRepository<Servizio, Long> {
	
}
