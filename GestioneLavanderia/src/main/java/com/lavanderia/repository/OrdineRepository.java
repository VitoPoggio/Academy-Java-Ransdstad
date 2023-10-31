package com.lavanderia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanderia.model.Ordine;

public interface OrdineRepository extends JpaRepository<Ordine, Long> {
	
}
