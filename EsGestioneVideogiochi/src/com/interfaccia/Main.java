package com.interfaccia;

import java.util.List;

import com.architectur.model.Utente;
import com.architectur.model.Videogioco;
import com.test.DatiTest;

public class Main {
	private static List<Videogioco> videogiochi;
	private static List<Utente> utenti;
	
	public static void main(String[] args) {
		//creazione dati test iniziali
		videogiochi = DatiTest.creaDatiTestVideogioco();
		utenti = DatiTest.creaDatiTestUtente();
		
		Menu m = new Menu(videogiochi, utenti);
		
	}
}
