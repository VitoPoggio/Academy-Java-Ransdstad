# EsercizioGestoreAuto

Parte 1: Definizione delle Strutture
Obiettivo: Creare una struttura dati e le classi di base (Auto, GestioneAuto, File di testo)

Parte 2: Interazione con l'Utente
Obiettivo: Creare un'interfaccia di interazione testuale con l'utente.
Dettagli Implementazione:
Menu Console Principale:
- Aggiungi auto
- Modifica auto
- Elimina auto
- Visualizza tutte le auto
- Cerca auto per targa
- Esci

Sottomenu per Modifica Auto: Dopo aver selezionato un'auto per la targa, presenta un altro menu:
- Modifica marca
- Modifica modello
- Modifica anno
- Modifica targa
- Modifica prezzo
- Modifica tipo di carburante
- Torna al menu principale

Parte 3: Operazioni su File
Obiettivo: Implementare funzioni per leggere e scrivere sul file di testo.
Dettagli Implementazione:
- Funzione leggiDaFile(): Dovrebbe leggere le informazioni dal file e popolare la lista listaAuto.
- Funzione scriviSuFile(): Dovrebbe scrivere le informazioni dalla lista listaAuto al file, ogni volta che l'elenco viene modificato.

Parte 4: Operazioni Avanzate
Obiettivo: Implementare funzioni di ricerca e filtraggio.
Dettagli Implementazione:
- Funzione cercaAutoPerAnno(): Dovrebbe permettere all'utente di inserire un anno e visualizzare tutte le auto di quell'anno.
- Funzione filtraAutoPerPrezzo(): Dovrebbe permettere all'utente di inserire un range di prezzo e visualizzare tutte le auto all'interno di quel range.

#Step Implementazione

Chunk 20min

Mattina 

Chunk 1:
  Creazione classe Auto e GestioneAuto con attributi e metodi.

Chunk 2:
  Creazione menu principale e test metodi GestioneAuto.

Chunk 3:
  Test Menu principale e Implementazione metodo "Modifica Auto"

Chunk 4:
  Adattamento Menu Principale con SottoMenu "Modifica Auto"
  Ultimi ritocchi al menu


Pomeriggio

Chunk 1:
  Aggiunta nuove funzionalità di ricerca per anno e per prezzo.
  Controlli su user input.

Chunk 2:
  Pulizia del codice.
  Gestione di eccezioni e controlli su user input.
  Retest delle funzionalità.
