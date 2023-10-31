
public class Manager extends Dipendente{

	public Manager() {
		super();
		this.setRuolo(RuoliPossibili.Gestore);
	}
	
	public void assumi(Dipendente d) {
		System.out.println("Dichiaro " + d.getNome() + " " + d.getCognome() + " ufficialmente assunto in ruolo di " + d.getRuolo());
	}
	
	public void licenzia(Dipendente d) {
		System.out.println("Dichiaro " + d.getNome() + " " + d.getCognome() + " licenziato.");
	}
}
