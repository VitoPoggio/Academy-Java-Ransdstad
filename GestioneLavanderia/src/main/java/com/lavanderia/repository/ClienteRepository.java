package com.lavanderia.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanderia.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
