
public class Torta extends Prodotto {

	
	public Torta() {
	}

	public void taglia() {
		this.numPezzi = 8;
		this.prezzo_singolo = super.getPrezzo()/8;
		System.out.println("torta tagliata");
	}

	public boolean vendiTorta(int pezzi) {
		if (this.numPezzi > 0 && this.numPezzi >= pezzi) {
			this.numPezzi -= pezzi;
			return true;
		} else if (this.numPezzi > 0 && this.numPezzi < pezzi) {
			return false;
		} else {
			return false;
		}
	}

	
	
	public int getNumPezzi() {
		return numPezzi;
	}

	public void setNumPezzi(int numPezzi) {
		this.numPezzi = numPezzi;
	}


	public float getPrezzo_singolo() {
		return prezzo_singolo;
	}

	public void setPrezzo_singolo(float prezzo_singolo) {
		this.prezzo_singolo = prezzo_singolo;
	}



	private int numPezzi = 1;
	private float prezzo_singolo;

}
