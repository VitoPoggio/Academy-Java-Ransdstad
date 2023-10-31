import java.util.List;

public class Cliente {

	public Cliente() {
	}

	public boolean aggiungiAlCarrello(Prodotto p) {

		try {
			for (int i = 0; i < carrello.size(); i++) {
				if (carrello.get(i).getNome().equals(p.getNome())) {
					carrello.get(i).setQuantitaDisponibile(
							carrello.get(i).getQuantitaDisponibile() + p.getQuantitaDisponibile());
					return true;
				}
			}
			carrello.add(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean effettuaOrdine() {
		
		try {
			// controlla che carrello abbia almeno un elemento
			if (carrello.size() > 0) {
				carrello.clear();
				System.out.println("Ordine effettuato");
				return true;
			} else {
				System.out.println("Il carrello è vuoto");
				return false;
			}
			// dovrebbe svuotare il carrello e poi farà anche scalo dei soldi
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<Prodotto> getCarrello() {
		return carrello;
	}

	public void setCarrello(List<Prodotto> carrello) {
		this.carrello = carrello;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + ", carrello=" + carrello
				+ "]";
	}

	private String nome;
	private String cognome;
	private String indirizzo;
	private List<Prodotto> carrello;

}
