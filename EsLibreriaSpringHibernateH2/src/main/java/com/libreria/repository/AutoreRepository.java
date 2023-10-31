package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.model.Autore;

public interface AutoreRepository extends JpaRepository<Autore, Long> {

}
