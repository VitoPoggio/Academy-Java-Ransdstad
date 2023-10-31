package com.architectur.model;

public class Videogioco {
	private String nome_videogioco;
	private String genere_videogioco;
	
	public String gioca() {
		return "Stai giocando a: " + nome_videogioco;
	}
	
	
	public Videogioco(String nome_videogioco, String genere_videogioco) {
		this.nome_videogioco = nome_videogioco;
		this.genere_videogioco = genere_videogioco;
	}


	public String getNome_videogioco() {
		return nome_videogioco;
	}
	public void setNome_videogioco(String nome_videogioco) {
		this.nome_videogioco = nome_videogioco;
	}
	public String getGenere_videogioco() {
		return genere_videogioco;
	}
	public void setGenere_videogioco(String genere_videogioco) {
		this.genere_videogioco = genere_videogioco;
	}
	
	
}
