package com.biblioteca.model;

import java.util.List;

import lombok.Data;

@Data
public class Membro {
	private Long id;
    private String nome;
    private String cognome;
    private String email;
    private List<Prenotazione> prenotazioni;

}
