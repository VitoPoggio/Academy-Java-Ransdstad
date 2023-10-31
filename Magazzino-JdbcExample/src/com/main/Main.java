package com.main;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import com.dao.ClientiDAO;
import com.dao.MagazzinoDAO;
import com.dao.OrdiniDAO;
import com.dao.ProdottiDAO;
import com.dbmanager.DbManager;

/*
 * 
In base al database Negozio, creare un client che permette l’inserimento di nuovi prodotti,
 di nuovi clienti, di nuovi ordini e la gestione di questi(ovvero update ed eliminazione righe).

Permettere ad un eventuale utente la visualizzazione del catalogo e l’acquisto di diversi prodotti
 per un ordine, quindi un carrello e una cronologia ordini.
 * */

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			DbManager.getConnection();

			

			DbManager.closeConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*
 * ProdottiDAO prodottiDAO = new ProdottiDAO(DbManager.getConnection());
 * prodottiDAO.mostraProdotti();
 * 
 * //FUNZIONA //System.out.println("inserisci prodotto");
 * //prodottiDAO.inserisciProdotto(scan.next(), scan.next(), scan.next(),
 * scan.nextDouble());
 * 
 * //FUNZIONA //System.out.println("aggiorna prodotto"); //prodottiDAO.update(4,
 * "Sony", "PS5", "Nuova console sony", 800);
 * 
 * //FUNZIONA //System.out.println("elimina prodotto"); //prodottiDAO.delete(4);
 * prodottiDAO.mostraProdotti();
 */

/*
 * ClientiDAO clienti = new ClientiDAO(DbManager.getConnection());
 * clienti.mostraClienti();
 * 
 * //FUNZIONA //System.out.println("inserisci cliente");
 * //clienti.inserisciCliente("tizio@caio", "tizioCaio", "Tizio", "Caio",
 * "via di tizio"); //clienti.mostraClienti();
 * 
 * //FUNZIONA //System.out.println("aggiorna Cliente");
 * //clienti.update("tizio@caio", "ZioTizio", "Tizio", "Caio",
 * "via di tizio 5"); //clienti.mostraClienti(); //FUNZIONA
 * //System.out.println("elimina Cliente"); //clienti.delete("tizio@caio");
 * 
 * clienti.mostraClienti();
 */

/*
 * OrdiniDAO ordini = new OrdiniDAO(DbManager.getConnection());
 * ordini.mostraOrdini();
 * 
 * System.out.println("inserimento ordine");
 * ordini.inserisciOrdine("tizio@caio", new Date(), 650);
 * ordini.inserisciOrdine("tizio@caio", new Date(), 20); ordini.mostraOrdini();
 * 
 * System.out.println("aggiorna ordine"); ordini.update(2,
 * "vitukkio93@hotmail.it", new Date(), 1000); ordini.mostraOrdini();
 * 
 * System.out.println("elimina prodotto"); ordini.delete(2);
 * ordini.mostraOrdini();
 */

/*
 * MagazzinoDAO magazzino = new MagazzinoDAO(DbManager.getConnection());
 * magazzino.mostraMagazzino();
 * 
 * System.out.println("inserisci qta"); magazzino.inserisciMagazzino(4, 12);
 * magazzino.mostraMagazzino();
 * 
 * System.out.println("modifica qta"); magazzino.update(4, 8);
 * magazzino.mostraMagazzino();
 * 
 * System.out.println("elimina magazzino"); magazzino.delete(4);
 * magazzino.mostraMagazzino();
 */
