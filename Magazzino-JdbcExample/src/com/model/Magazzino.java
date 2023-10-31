package com.model;

public class Magazzino {
	private int id_prodotto;
	private int qta;

	public Magazzino() {
	}

	public Magazzino(int id_prodotto, int qta) {
		this.id_prodotto = id_prodotto;
		this.qta = qta;
	}

	public int getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public int getQta() {
		return qta;
	}

	public void setQta(int qta) {
		this.qta = qta;
	}

}
