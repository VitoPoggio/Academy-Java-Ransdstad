package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Ordine;

public class OrdiniDAO implements Constants {
	private Connection conn;
	
	public OrdiniDAO (Connection conn) {
		this.conn = conn;
	}
	
	public void mostraOrdini() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_ORDINI);
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
	
	public List<Ordine> getProdotti() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_ORDINI);
		List<Ordine> ordini = new ArrayList<Ordine>();
		rs.last();
		rs.beforeFirst();
		while(rs.next()) {
			Ordine ordine = new Ordine();
			ordine.setId_ordine(rs.getInt(1));
			ordine.setEmal_cliente(rs.getString(2));
			ordine.setData_ordine(rs.getDate(3));
			ordine.setCosto(rs.getDouble(4));
			ordini.add(ordine);
		}
		return ordini;
	}
	
	public void inserisciOrdine(Ordine ordine) throws SQLException {
		//il cursore del resultSet è in sola lettura. per fare aggiornamenti bisogna fare delle aggiunte
		//Uso TYPE_SCROLL per farlo scorrere in entrambe le direzioni o saltare gli indici. con RS normale non si può fare
		//Concurr UPDATEBLE lo fa diventare un cursore updatable (concorrenza in aggiornamento)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(INSERT_ORDINE);
		//sposto il cursore sulla righa in cui inserire (per questo serve scroll)
		rs.last();
		rs.moveToInsertRow();
		//costruisco la riga facendo updateTIPO per ogni colonna
		rs.updateInt(1, ordine.getId_ordine());
		rs.updateString(2, ordine.getEmal_cliente());
		rs.updateDate(3, new java.sql.Date(ordine.getData_ordine().getTime()));
		rs.updateDouble(4, ordine.getCosto());
		//Scrivo la riga e faccio commit perchè autocommit è disabilitato
		rs.insertRow();
		conn.commit();
		System.out.println("Inserito nuovo Ordine " + ordine.getId_ordine());
	}
	
	public void update(Ordine ordine) throws SQLException{
		
		//per fare update bisogna usare PreparedStatement e impostare SCROLL e UPDATABLE
		PreparedStatement ps = conn.prepareStatement(UPDATE_ORDINE,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//l'indice di setTIPO si riferisce ai ? nella query
		ps.setInt(1, ordine.getId_ordine());
		//executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		rs.next(); //o rs.next(): è alquanto indifferente
		//faccio updateString con i dati recuperati dal objSet
		rs.updateInt(1, ordine.getId_ordine());
		rs.updateString(2, ordine.getEmal_cliente());
		rs.updateDate(3, new java.sql.Date(ordine.getData_ordine().getTime()));
		rs.updateDouble(4, ordine.getCosto());
		rs.updateRow();
		conn.commit();
		System.out.println("Aggiornato Ordine: " + ordine.getId_ordine());
		
		
	}
	
	public void delete(Ordine ordine) throws SQLException {
		// anche per DELETE bisogna usare PreparedStatement e impostare SCROLL e
		// UPDATABLE
		PreparedStatement ps = conn.prepareStatement(DELETE_ORDINE, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		// l'indice di setTIPO si riferisce ai ? nella query
		ps.setInt(1, ordine.getId_ordine() );
		// executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		// in caso non sappiamo in base a cosa eliminare dovremmo fare un ciclo
		rs.first(); // o rs.next(): è alquanto indifferente
		// faccio updateString con i dati recuperati dal objSet
		rs.deleteRow();
		conn.commit();
		System.out.println("Rimosso Ordine: " + ordine.getId_ordine());

	}
}
