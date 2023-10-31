package com.listaappuntamenti.model;

import java.util.List;

import lombok.Data;

@Data

public class Dottore {

	private Long id;
	private String nome;
	private List<Appuntamento> appuntamenti;
	
}
