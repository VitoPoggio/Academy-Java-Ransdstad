import java.util.ArrayList;

public class Prodotto {

	public Prodotto() {
	}

	public String getNome() {

		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public ArrayList<IngredientiPossibili> getIngredienti() {
		return ingredienti;
	}

	public void setIngredienti(ArrayList<IngredientiPossibili> ingredienti) {
		this.ingredienti = ingredienti;
	}

	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}

	public boolean vendi() {
		if(this.quantitaDisponibile > 0) {
			this.quantitaDisponibile--;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + ", ingredienti=" + ingredienti
				+ ", quantitaDisponibile=" + quantitaDisponibile + "]";
	}

	private String nome;
	private float prezzo;
	private ArrayList<IngredientiPossibili> ingredienti;
	private int quantitaDisponibile;

}
