package com.model;

public class Prodotto {
	private int id_prodotto;
	private String marca;
	private String modello;
	private String descrizione;
	private double prezzo;
	
	
	public Prodotto() {
	}


	public Prodotto(int id_prodotto, String marca, String modello, String descrizione, double prezzo) {
		this.id_prodotto = id_prodotto;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}


	public int getId_prodotto() {
		return id_prodotto;
	}


	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
	
}
