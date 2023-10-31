# EsercizioLibreriaOnline

Esercizio: Creazione di un sistema di raccomandazione per una libreria online

Parte 1: Strutturazione del database e della logica di base
Descrizione: Il tuo compito è progettare e implementare un sistema base per una libreria online. Questo sistema dovrebbe essere in grado di gestire utenti, libri e le recensioni fatte dagli utenti sui libri.
Dettagli:
Crea una classe Utente con attributi come id, nome, email e una lista di libri acquistati.
Crea una classe Libro con attributi come id, titolo, autore, genere e prezzo.
Crea una classe Recensione che associ un Utente a un Libro e includa una valutazione (da 1 a 5 stelle) e un commento testuale.
Crea una classe LibreriaOnline che mantenga una lista di Utenti, Libri e Recensioni.
Implementa metodi nella classe LibreriaOnline per permettere agli utenti di acquistare libri, lasciare recensioni e visualizzare tutti i libri disponibili.

Parte 2: Implementazione del sistema di raccomandazione
Descrizione: creare un sistema di raccomandazione per suggerire libri agli utenti basato sulle loro preferenze e sulle recensioni lasciate.
Dettagli:
Aggiungi un metodo raccomandaLibri nella classe Utente. Questo metodo, quando invocato, dovrebbe ritornare una lista di libri suggeriti.
La raccomandazione dovrebbe basarsi sui seguenti criteri:
Libri dello stesso genere di quelli che l'utente ha già acquistato e che hanno una valutazione media alta (ad esempio, 4 o 5 stelle).
Libri scritti dagli autori dei libri già acquistati dall'utente.
Se l'utente non ha acquistato nessun libro o se non ci sono libri che soddisfano i criteri sopra, suggerisci i libri più popolari della libreria.
Implementa un metodo valutazioneMedia nella classe Libro per calcolare la valutazione media basata sulle recensioni.
Nella classe LibreriaOnline, implementa un metodo libriPopolari che ritorna i libri con il maggior numero di recensioni positive.
L'obiettivo finale di questo esercizio è sviluppare un sistema di raccomandazione che suggerisca libri pertinenti e di interesse per l'utente, migliorando così l'esperienza dell'utente e aumentando potenzialmente le vendite per la libreria.

#Step di implementazione

Chunk 1
	Creazione classi Libro, Utente, Recensioni con attributi
	Creazione LibreriaOnline con metodi di connessione a DB e lettura tabelle
	Creazione db LibreriaOnline con tabelle dati di test.
	
Chunk 2
	Creazione metodo media e metodi per aggiunta su db
	
Chunk3
	Creazione metodi di Raccomandazione

Pomeriggio
Chunk 4
	Inserimento ulteriori dati su DB e Test più approfonditi
	Creazione metodo Libri Popolari

 Chunk 5
   Miglioramento forma del codice
