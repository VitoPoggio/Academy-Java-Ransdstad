package com.biblioteca.model;

import lombok.Data;

@Data
public class Libro {
	private Long id;
    private String titolo;
    private String autore;
    private String genere;
    private int annoPubblicazione;
    private int quantitàDisponibile;
    
    public boolean compareLibro(Libro l) {
    	if(l.getTitolo().equals(this.titolo)&&
    			l.getAutore().equals(this.autore)&&
    			l.getAnnoPubblicazione()==(this.getAnnoPubblicazione())) {
    		return true;
    	}
    	return false;
    }
}
