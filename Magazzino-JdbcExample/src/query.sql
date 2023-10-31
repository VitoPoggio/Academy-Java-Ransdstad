select email_cliente, from clienti where email_cliente = "tizio"
select marca, modello, prezzo, qta from prodotti, magazzino where magazzino.id_prodotto = prodotti.id_prodotto

insert into magazzino values (3,5);
insert into magazzino values (5,15);

delete from ordini where id_ordine = 1