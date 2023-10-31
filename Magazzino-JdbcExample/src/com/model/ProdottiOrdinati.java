package com.model;

public class ProdottiOrdinati {
	private int id_ordine;
	private int id_prodotto;
	private int qta;

	public ProdottiOrdinati() {
	}

	public ProdottiOrdinati(int id_ordine, int id_prodotto, int qta) {
		this.id_ordine = id_ordine;
		this.id_prodotto = id_prodotto;
		this.qta = qta;
	}

	public int getId_ordine() {
		return id_ordine;
	}

	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
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
