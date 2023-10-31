# Biblioteca Spring

piattaforma per una biblioteca municipale che consente ai membri di prenotare libri online. La biblioteca ha una serie di libri, ognuno con una quantità limitata. Un membro può prenotare un libro, e una volta prenotato, il libro sarà riservato per lui/lei per 3 giorni. Se il membro non viene a ritirare il libro entro 3 giorni, la prenotazione viene annullata.

Requisiti:
Un libro ha un ID, titolo, autore, genere, anno di pubblicazione e una quantità disponibile.
Un membro ha un ID, nome, cognome, email e una lista di libri prenotati.
Un membro può prenotare solo un libro alla volta, ma può avere fino a 3 prenotazioni contemporaneamente.
Una prenotazione ha una data di inizio e una data di fine (3 giorni dopo la data di inizio).

# Implementati

Implementati Model, Repository e service. Usati dei Map come strutture per i dati. 

# Da completare

Service e Controller con gestione errori e validazioni