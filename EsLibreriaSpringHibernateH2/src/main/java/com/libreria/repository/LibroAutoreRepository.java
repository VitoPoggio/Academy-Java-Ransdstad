package com.libreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libreria.model.LibroAutore;

public interface LibroAutoreRepository extends JpaRepository<LibroAutore, Long> {

}
