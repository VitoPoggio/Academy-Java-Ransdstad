

public class Libro {

	public void mostraDettagli() {
		System.out.println(this.toString());
	}
	
	public Libro() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	 @Override
	    public String toString() {
	        return "Libro [id=" + id + ", titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + ", prezzo=" + prezzo + "]";
	    }
	 
	private int id;
	private String titolo;
	private String autore;
	private String genere;
	private float prezzo;

}
