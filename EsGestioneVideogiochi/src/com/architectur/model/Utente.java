package com.architectur.model;

import java.util.List;

public class Utente {
	private String username;
	private String password;

	// lista utenti Crearla da fuori e fare metodo "aggiungi utente" che controlla
	// se esiste già un utente

	public Utente(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean aggiungiUtente(List<Utente> utenti, Utente utente) {
		// forse contains non funziona bene così
		boolean aggiungi = true;
		for (Utente u : utenti) {
			if (u.getUsername().equals(utente.getUsername())) {
				aggiungi = false;
			} else {
				aggiungi = true;
			}

		}
		return aggiungi;

	}

	public boolean loginUtente(List<Utente> utenti, Utente utente) {
		boolean login = false;
		for (Utente u : utenti) {
			if (u.getUsername().equals(utente.getUsername())) {
				System.out.println("utente trovato. Controllo pass"); // debug
				if (u.getPassword().equals(utente.getPassword())) {
					login = true;
				} else {
					login = false;
					System.out.println("password errata");
				}

			}
		}
		return login;

	}

	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password + "]";
	}

}
