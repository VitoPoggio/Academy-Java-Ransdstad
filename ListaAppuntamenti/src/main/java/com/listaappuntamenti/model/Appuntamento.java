package com.listaappuntamenti.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Appuntamento {
	
	private Long id;
	private LocalDateTime dataEOra;
	private String nomeCliente;
	private String descrizione;
	
}