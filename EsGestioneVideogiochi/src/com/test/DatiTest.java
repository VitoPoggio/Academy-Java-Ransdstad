package com.test;

import java.util.ArrayList;
import java.util.List;

import com.architectur.model.Utente;
import com.architectur.model.Videogioco;
import com.architectur.model.VideogiocoAzione;
import com.architectur.model.VideogiocoStrategia;

public class DatiTest {
	public static List<Utente> creaDatiTestUtente() {
		
		List<Utente> utentiTest = new ArrayList<Utente>();
		Utente ut1 = new Utente("tizio", "pass");
		utentiTest.add(ut1);
		Utente ut2 = new Utente("vituk", "pass");
		utentiTest.add(ut2);
				
		return utentiTest;
		
	}
	
	public static List<Videogioco> creaDatiTestVideogioco(){
		
		List<Videogioco> videogiochiTest = new ArrayList<Videogioco>();
		VideogiocoAzione vg1 = new VideogiocoAzione("PrinceOfPersia", "azione");
		videogiochiTest.add(vg1);
		VideogiocoStrategia vg2 = new VideogiocoStrategia("Risiko", "strategia");
		videogiochiTest.add(vg2);
		
		
		
		
		return videogiochiTest;
		
	}
}
