package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.model.Magazzino;

public class MagazzinoDAO implements Constants {
	private Connection conn;

	public MagazzinoDAO(Connection conn) {
		this.conn = conn;
	}

	public void mostraMagazzino() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_MAGAZZINO);
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
	
//	public List<Magazzino> getProdotti() throws SQLException {
//		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		ResultSet rs = stmt.executeQuery(SELECT_MAGAZZINO);
//		List<Prodotto> prodotti = new ArrayList<Prodotto>();
//		rs.last();
//		rs.beforeFirst();
//		while(rs.next()) {
//			Prodotto prod = new Prodotto();
//			prod.setId_prodotto(rs.getInt(1));
//			prod.setMarca(rs.getString(2));
//			prod.setModello(rs.getString(3));
//			prod.setDescrizione(rs.getString(4));
//			prod.setPrezzo(rs.getDouble(5));
//			prodotti.add(prod);
//		}
//		return prodotti;
//	}
	
	

	public void inserisciMagazzino(int id, int qta) throws SQLException {
		// il cursore del resultSet è in sola lettura. per fare aggiornamenti bisogna
		// fare delle aggiunte
		// Uso TYPE_SCROLL per farlo scorrere in entrambe le direzioni o saltare gli
		// indici. con RS normale non si può fare
		// Concurr UPDATEBLE lo fa diventare un cursore updatable (concorrenza in
		// aggiornamento)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(INSERT_MAGAZZINO);
		// sposto il cursore sulla righa in cui inserire (per questo serve scroll)
		rs.moveToInsertRow();
		// costruisco la riga facendo updateTIPO per ogni colonna
		rs.updateInt(1, id);
		rs.updateInt(2, qta);
		// Scrivo la riga e faccio commit perchè autocommit è disabilitato
		rs.insertRow();
		conn.commit();
		System.out.println("Inserito nuova quantità per " + id);

	}

	public void update(int id, int qta) throws SQLException {

		// per fare update bisogna usare PreparedStatement e impostare SCROLL e
		// UPDATABLE
		PreparedStatement ps = conn.prepareStatement(UPDATE_MAGAZZINO, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		// l'indice di setTIPO si riferisce ai ? nella query
		ps.setInt(1, id);
		// executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		rs.next(); // o rs.next(): è alquanto indifferente
		// faccio updateString con i dati recuperati dal objSet
		rs.updateInt(1, id);
		rs.updateInt(2, qta);
		rs.updateRow();
		conn.commit();
		System.out.println("Aggiornato Record " + id);

	}

	public void delete(int id_prodotto) throws SQLException {
		// anche per DELETE bisogna usare PreparedStatement e impostare SCROLL e
		// UPDATABLE
		PreparedStatement ps = conn.prepareStatement(DELETE_MAGAZZINO, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		// l'indice di setTIPO si riferisce ai ? nella query
		ps.setInt(1, id_prodotto);
		// executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		// in caso non sappiamo in base a cosa eliminare dovremmo fare un ciclo
		rs.first(); // o rs.next(): è alquanto indifferente
		// faccio updateString con i dati recuperati dal objSet
		rs.deleteRow();
		conn.commit();
		System.out.println("Rimosso da magazzino: " + id_prodotto);

	}
}
