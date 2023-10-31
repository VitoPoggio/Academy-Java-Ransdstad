package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Cliente;


public class ClientiDAO implements Constants {
	private Connection conn;
	
	public ClientiDAO(Connection conn){
		this.conn = conn;
	}
	
	public void mostraClienti() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_CLIENTI);
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
	
	public List<Cliente> getClienti() throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(SELECT_CLIENTI);
		List<Cliente> clienti = new ArrayList<Cliente>();
		rs.last();
		rs.beforeFirst();
		while(rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setEmail_cliente(rs.getString(1));
			cliente.setUsername(rs.getString(2));
			cliente.setNome(rs.getString(3));
			cliente.setCognome(rs.getString(4));
			cliente.setIndirizzo(rs.getString(5));
			clienti.add(cliente);
			
		}
		return clienti;
	}
	
	public void inserisciCliente(Cliente cliente) throws SQLException {
		//il cursore del resultSet è in sola lettura. per fare aggiornamenti bisogna fare delle aggiunte
		//Uso TYPE_SCROLL per farlo scorrere in entrambe le direzioni o saltare gli indici. con RS normale non si può fare
		//Concurr UPDATEBLE lo fa diventare un cursore updatable (concorrenza in aggiornamento)
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stmt.executeQuery(INSERT_CLIENTE);
		//sposto il cursore sulla righa in cui inserire (per questo serve scroll)
		rs.moveToInsertRow();
		//costruisco la riga facendo updateTIPO per ogni colonna
		rs.updateString(1, cliente.getEmail_cliente());
		rs.updateString(2, cliente.getUsername());
		rs.updateString(3, cliente.getNome());
		rs.updateString(4, cliente.getCognome());
		rs.updateString(5, cliente.getIndirizzo());
		//Scrivo la riga e faccio commit perchè autocommit è disabilitato
		rs.insertRow();
		conn.commit();
		System.out.println("Inserito nuovo Cliente: " + cliente.getEmail_cliente());
		
	}
	
	public void update(Cliente cliente) throws SQLException{
		
		//per fare update bisogna usare PreparedStatement e impostare SCROLL e UPDATABLE
		PreparedStatement ps = conn.prepareStatement(UPDATE_CLIENTE,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//l'indice di setTIPO si riferisce ai ? nella query
		ps.setString(1, cliente.getEmail_cliente());
		//executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		rs.next(); //o rs.next(): è alquanto indifferente
		//faccio updateString con i dati recuperati dal objSet
		rs.updateString(1, cliente.getEmail_cliente());
		rs.updateString(2, cliente.getUsername());
		rs.updateString(3, cliente.getNome());
		rs.updateString(4, cliente.getCognome());
		rs.updateString(5, cliente.getIndirizzo());
		rs.updateRow();
		conn.commit();
		System.out.println("Aggiornato Cliente: " + cliente.getEmail_cliente());
		
		
	}
	
	public void delete(Cliente cliente) throws SQLException {
		// anche per DELETE bisogna usare PreparedStatement e impostare SCROLL e
		// UPDATABLE
		PreparedStatement ps = conn.prepareStatement(DELETE_CLIENTE, ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE);
		// l'indice di setTIPO si riferisce ai ? nella query
		ps.setString(1, cliente.getEmail_cliente());
		// executeQuery non serve una query perchè la prenderà dal Prepared
		ResultSet rs = ps.executeQuery();
		// in caso non sappiamo in base a cosa eliminare dovremmo fare un ciclo
		rs.first(); // o rs.next(): è alquanto indifferente
		// faccio updateString con i dati recuperati dal objSet
		rs.deleteRow();
		conn.commit();
		System.out.println("Rimosso Cliente: " + cliente.getEmail_cliente());

	}
}
