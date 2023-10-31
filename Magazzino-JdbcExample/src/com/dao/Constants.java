package com.dao;

public interface Constants {
	String URL = "jdbc:mysql://localhost:3306/negozio_online?serverTimezone=Europe/Rome";
	String username = "vituk";
	String password = "pass";
	String Driver = "com.mysql.cj.jdbc.Driver";
	
	

	// Prodotti
	String SELECT_PRODOTTI = "select * from prodotti";
	// inserimento con resultset bisogna usare il select
	// non funziona con *. bisogna specificare i nomi dei campi
	String INSERT_PRODOTTO = "select id_prodotto, marca, modello, descrizione, prezzo from prodotti";
	// per update si deve usare anche un where per specificare cosa usare per
	// modificare.
	// si usa ? al posto di una variabile in modo tale da far compilare la query una
	// sola volta
	// ed evitare anche problemi di SQLInjection
	String UPDATE_PRODOTTO = "select id_prodotto, marca, modello, descrizione, prezzo from prodotti where id_prodotto = ?";
	String DELETE_PRODOTTO = "select id_prodotto, marca, modello, descrizione, prezzo from prodotti where id_prodotto = ?";

	// Clienti
	String SELECT_CLIENTI = "select * from clienti";
	String INSERT_CLIENTE = "select email_cliente, username, nome, cognome, indirizzo from clienti";
	String UPDATE_CLIENTE = "select email_cliente, username, nome, cognome, indirizzo from clienti where email_cliente = ?";
	String DELETE_CLIENTE = "select email_cliente from clienti where email_cliente = ?";

	// Ordini
	String SELECT_ORDINI = "select * from ordini";
	String INSERT_ORDINE = "select id_ordine, email_cliente, data_ordine, costo_totale from ordini";
	String UPDATE_ORDINE = "select id_ordine, email_cliente, data_ordine, costo_totale from ordini where id_ordine = ?";
	String DELETE_ORDINE = "select id_ordine from ordini where id_ordine = ?";

	// Magazzino
	
	String SELECT_MAGAZZINO = "select prodotti.id_prodotto, marca, modello, prezzo, qta from prodotti, magazzino where magazzino.id_prodotto = prodotti.id_prodotto";
	String INSERT_MAGAZZINO = "select id_prodotto, qta from magazzino";
	String UPDATE_MAGAZZINO = "select id_prodotto, qta from magazzino where id_prodotto = ?";
	String DELETE_MAGAZZINO = "select id_prodotto from magazzino where id_prodotto = ?";
	
	//ProdottiOrdinati
	String SELECT_PROD_ORD = "select * from prodotti_ordinati";
	String INSERT_PROD_ORD = "select id_ordine, id_prodotto, qta from prodotti_ordinati";
	String UPDATE_PROD_ORD = "select id_ordine, id_prodotto, qta from prodotti_ordinati where id_ordine = ?";
	String DELETE_PROD_ORD = "select id_ordine from ordini where id_ordine = ?";
}
