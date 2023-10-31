import java.util.Date;

public class Dipendente {

	public Dipendente() {}
	
	
	public void lavora() {
		
		if(this.ruolo == null) {
			System.out.println("Non hai un lavoro! Mi dispiace.");
		}
		else if(this.ruolo == RuoliPossibili.Pasticciere) {
			System.out.println("Stendendo il pan di spagna...");
		}
		else if(this.ruolo == RuoliPossibili.Gestore) {
			System.out.println("Organizzando le risorse...");
		}
		else if(this.ruolo == RuoliPossibili.Operaio_pulizie) {
			System.out.println("Pulendo la cucina...");
		}
		else if(this.ruolo == RuoliPossibili.Cassiere) {
			System.out.println("Chiudendo la cassa...");
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
	public Date getDataDiNascita() {
		return dataDiNascita;
	}
	public void setDataDiNascita(Date dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}
	public Date getDataAssunzione() {
		return dataAssunzione;
	}
	public void setDataAssunzione(Date dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	public RuoliPossibili getRuolo() {
		return ruolo;
	}
	public void setRuolo(RuoliPossibili ruolo) {
		this.ruolo = ruolo;
	}

	

	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", cognome=" + cognome + ", dataDiNascita=" + dataDiNascita
				+ ", dataAssunzione=" + dataAssunzione + ", ruolo=" + ruolo + "]";
	}



	private String nome;
	private String cognome;
	private Date dataDiNascita;
	private Date dataAssunzione;
	private RuoliPossibili ruolo;
	
}
