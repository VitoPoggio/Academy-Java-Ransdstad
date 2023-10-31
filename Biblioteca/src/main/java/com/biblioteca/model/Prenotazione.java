package com.biblioteca.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Prenotazione {
    private Long id;
    private LocalDate dataInizio;
    private LocalDate dataFine;
    private Libro libro;

}
