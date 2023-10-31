package com.architectur.model;

public class VideogiocoAzione extends Videogioco {
	

	public VideogiocoAzione(String nome_videogioco, String genere_videogioco) {
		super(nome_videogioco, genere_videogioco);
		// TODO Auto-generated constructor stub
	}

	public String combatti() {
		return "Combattimento in corso...";
	}

}
