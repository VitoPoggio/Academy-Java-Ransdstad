# Gestione Pasticceria

Creare una classe Prodotto che rappresenti un singolo articolo venduto nella pasticceria con un metodo vendi() che riduce la quantità disponibile quando il prodotto viene venduto.
Creare una classe Cliente che rappresenti un cliente del negozio. Ogni cliente dovrebbe avere: nome, cognome, indirizzo, carrello (una lista di prodotti che il cliente intende acquistare), un metodo aggiungiAlCarrello(Prodotto p) per aggiungere prodotti al carrello ed un metodo effettuaOrdine() per confermare l'acquisto dei prodotti nel carrello.

Classi Derivate:
Dalla classe Prodotto, creare diverse sottoclassi che rappresentino categorie specifiche di prodotti.

Gestione del Personale:
Creare una classe Dipendente con le seguenti proprietà:
nome, cognome, dataDiNascita, dataAssunzione, ruolo (es. "Pasticcere", "Cassiere", "Manager").
Un metodo lavora() che stampa un messaggio in base al ruolo del dipendente.

Creare una classe Manager derivata da Dipendente con metodi aggiuntivi come assumi(Dipendente d) e licenzia(Dipendente d).
Sistema di Prenotazione:

Creare una classe Amministrazione con metodi che permettano di:
Aggiungere o rimuovere prodotti dal catalogo.
Visualizzare l'elenco dei prodotti più venduti.
Gestire gli ordini dei clienti.
Visualizzare e gestire le prenotazioni.
Assumere, licenziare o visualizzare la lista dei dipendenti.

Implementare un sistema di prenotazione che permetta ai clienti di prenotare prodotti in anticipo. Il sistema dovrebbe tracciare le prenotazioni e assicurarsi che i prodotti prenotati non vengano venduti ad altri clienti.
Interfaccia di Amministrazione:

Implementare un sistema di fedeltà per i clienti che offre sconti basati sulle spese accumulate.
Creare una classe Fornitore che rappresenti aziende che forniscono ingredienti alla pasticceria. Implementare metodi per ordinare ingredienti, tracciare le scorte e gestire le fatture.
Introdurre una valutazione di feedback per i clienti per valutare i prodotti e fornire suggerimenti.
Inserire i soldi dell cliete

#Implementato

Cliente: Classe Cliente, permette di creare un nuovo cliente con attributi nome, cognome, indirizzo e carrello. Metodo "aggiungiAlCarrello(Prodotto p) che prende un prodotto, controlla se è già presente nel carrello e lo aggiunge da 0 o aumentando la quantità. Metodo "effettuaOrdine()" svuoterà il carrello se è presente almeno un prodotto.

Prodotto: Classe prodotto crea un prodotto con attributi nome, prezzo, lista ingredienti, quantitaDisponibile. Metodo "vendi()" riduce quantitàDisponibile.

Torta: Estende Prodotto, crea un oggetto torta con numPezzi e prezzoSingolo Metodo "taglia()" modifica numPezzi in 8 Metodo "vendiTorta(int pezzi)" rimuove pezzi da numPezzi.

Croissant_Vullet Estende Prodotto, crea un oggetto di tipo Croissant_Vullet con enum di ingredienti disponibili Metodo "riempi(String r)" riempie il croissant con r se presente in lista disponibili

Dipendente: Classe dipendente, crea un oggetto di tipo Dipendente con nome, cognome, dataNascita, dataAssunzione e ruolo (enum di RuoliPossibili) Metodo "lavora()" controlla il ruolo assegnato al dipendente.

Manager: Estende Dipendente assegnado il ruolo gestore alla creazione dell'oggetto Manager. Metodo "assumi(Dipendente d)" assume d Metodo "licenzia(Dipendente d)" licenzia d

#Non implementato

Implementare un sistema di fedeltà per i clienti che offre sconti basati sulle spese accumulate.
Creare una classe Fornitore che rappresenti aziende che forniscono ingredienti alla pasticceria. Implementare metodi per ordinare ingredienti, tracciare le scorte e gestire le fatture.
Introdurre una valutazione di feedback per i clienti per valutare i prodotti e fornire suggerimenti.
Inserire i soldi dell cliete


