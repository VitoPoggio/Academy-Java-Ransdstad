package com.interfaccia;

import java.util.List;
import java.util.Scanner;

import com.architectur.model.Utente;
import com.architectur.model.Videogioco;

public class Menu {

	private List<Videogioco> videogiochi;
	private List<Utente> utenti;
	private Scanner scan = new Scanner(System.in);
	//potrebbe servire variabile utente globale

	public Menu(List<Videogioco> videogiochi, List<Utente> utenti) {
		this.videogiochi = videogiochi;
		this.utenti = utenti;
		avvia();
	}

	private void avvia() {
		while (true) {
			System.out.println("Accedi o registrati");
			System.out.println("1) LogIn");
			System.out.println("2) Registrati");
			switch (scan.nextInt()) {
			case 1:
				if (logIn() == true)
					sceltaGioco();
				break;

			case 2:
				if (registra() == true)
					sceltaGioco();
				break;

			default:
				break;
			}

		}
	}

	private boolean registra() {
		System.out.println(utenti);
		System.out.println("Registrati");
		System.out.println("Inserisci username (no spazi)");
		String username = scan.next();
		System.out.println("Inserisci password");
		String pass = scan.next();
		Utente nuovo = new Utente(username, pass);
		if (nuovo.aggiungiUtente(utenti, nuovo) == true) {
			utenti.add(nuovo);
			System.out.println("Creato nuovo utente: " + username);
			System.out.println(utenti);
			return true;
		} else {
			System.out.println("Utente già registrato");
			return false;
		}
		

	}

	private boolean logIn() {
		System.out.print("Inserisci username: ");
		String username = scan.next();
		System.out.print("Inserisci password: ");
		String pass = scan.next();
		Utente log = new Utente(username,pass);
		if(log.loginUtente(utenti, log)==true) {
			System.out.println("Effettuato login di: " + log.getUsername());
			return true;
		}else {
			System.out.println("Utente non trovato o password errata");
			return false;
		}
		
	}

	private void sceltaGioco() {
		boolean gioca = true;
		do {
			for(int i = 0; i<videogiochi.size();i++) {
				System.out.println((i+1) + ") " + videogiochi.get(i).getNome_videogioco() + ", " + videogiochi.get(i).getGenere_videogioco());
			}
			System.out.println("Scegli numero gioco dalla lista: ");
			int scelta = scan.nextInt();
			//chiamare i metodi in base alla scelta
		} while (gioca == false);

	}

}
