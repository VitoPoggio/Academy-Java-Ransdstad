package com.model;

import java.util.Date;

public class Ordine {
	private int id_ordine;
	private String emal_cliente;
	private Date data_ordine;
	private double costo;

	public Ordine() {
	}

	public Ordine(int id_ordine, String emal_cliente, Date data_ordine, double costo) {
		this.id_ordine = id_ordine;
		this.emal_cliente = emal_cliente;
		this.data_ordine = data_ordine;
		this.costo = costo;
	}

	public int getId_ordine() {
		return id_ordine;
	}

	public void setId_ordine(int id_ordine) {
		this.id_ordine = id_ordine;
	}

	public String getEmal_cliente() {
		return emal_cliente;
	}

	public void setEmal_cliente(String emal_cliente) {
		this.emal_cliente = emal_cliente;
	}

	public Date getData_ordine() {
		return data_ordine;
	}

	public void setData_ordine(Date data_ordine) {
		this.data_ordine = data_ordine;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
