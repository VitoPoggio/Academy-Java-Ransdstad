package com.lavanderia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Servizio {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idServizio;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private double costo;
	@Column(nullable = false)
	private int ore;

}
