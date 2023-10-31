package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ProdottiOrdinatiDAO implements Constants{
	private Connection conn;
	
	public ProdottiOrdinatiDAO(Connection conn) {
		this.conn = conn;
	}
	
	public void mostraProdOrd() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_PROD_ORD);
		ResultSetMetaData meta = rs.getMetaData();
		// stampa risultati
		for (int i = 1; i <= meta.getColumnCount(); i++) {
			System.out.printf("%-20s\t", meta.getColumnName(i));
		}
		System.out.println();
		while (rs.next()) {
			for (int i = 1; i <= meta.getColumnCount(); i++) {
				System.out.printf("%-20s\t", rs.getObject(i));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void inserisciProdOrd(int id_ordine, int id_prodotto,  int qta) throws SQLException {
		//il cursore del resultSet è in sola lettura. per fare aggiornamenti bisogna fare delle aggiunte
		//Uso TYPE_SCROLL per farlo scorrere in entrambe le direzioni o saltare gli indici. con RS normale non si può fare
		//Concurr UPDATEBLE lo fa diventare un cursore updatable (concorrenza in aggiornamento)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(INSERT_PROD_ORD);
		//sposto il cursore sulla righa in cui inserire (per questo serve scroll)
		rs.moveToInsertRow();
		//costruisco la riga facendo updateTIPO per ogni colonna
		rs.updateInt(1, id_ordine);
		rs.updateInt(2, id_prodotto);
		rs.updateInt(1, qta);
		//Scrivo la riga e faccio commit perchè autocommit è disabilitato
		rs.insertRow();
		conn.commit();
		System.out.println("Inserito nuovo ordine " + id_ordine + " prodotto "+ id_prodotto);
		
	}
	
public void update(int id_ordine, int id_prodotto,  int qta) throws SQLException{
		
		//per fare update bisogna usare PreparedStatement e impostare SCROLL e UPDATABLE
		PreparedStatement ps = conn.prepareStatement(UPDATE_PROD_ORD,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//l'indice di setTIPO si riferisce ai ? nella query
		ps.setInt(1, id_prodotto);
		//executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		rs.next(); //o rs.next(): è alquanto indifferente
		//faccio updateString con i dati recuperati dal objSet
		rs.updateInt(1, id_ordine);
		rs.updateInt(2, id_prodotto);
		rs.updateInt(3, qta);
		rs.updateRow();
		conn.commit();
		System.out.println("Aggiornato ordine " + id_ordine + " prodotto "+ id_prodotto);
		
		
	}
	
/*
 * NON DOVREBBE SERVIRE SE FUNZIONA IL CASCADE public void delete(int
 * id_prodotto) throws SQLException { // anche per DELETE bisogna usare
 * PreparedStatement e impostare SCROLL e // UPDATABLE PreparedStatement ps =
 * conn.prepareStatement(DELETE_PRODOTTO, ResultSet.TYPE_SCROLL_INSENSITIVE,
 * ResultSet.CONCUR_UPDATABLE); // l'indice di setTIPO si riferisce ai ? nella
 * query ps.setInt(1, id_prodotto); // executeQuery non serve una query perchè
 * la prenderà dal Prepared ResultSet rs = ps.executeQuery(); // in caso non
 * sappiamo in base a cosa eliminare dovremmo fare un ciclo rs.first(); // o
 * rs.next(): è alquanto indifferente // faccio updateString con i dati
 * recuperati dal objSet rs.deleteRow(); conn.commit();
 * System.out.println("Rimosso Record"); }
 */
	
}
