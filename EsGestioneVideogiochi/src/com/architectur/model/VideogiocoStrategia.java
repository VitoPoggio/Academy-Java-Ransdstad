package com.architectur.model;

public class VideogiocoStrategia extends Videogioco{
	public VideogiocoStrategia(String nome_videogioco, String genere_videogioco) {
		super(nome_videogioco, genere_videogioco);
		// TODO Auto-generated constructor stub
	}

	public String pianifica() {
		return "Pianificazione strategia in corso...";
	}
}
