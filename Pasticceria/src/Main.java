import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		Dipendente d = new Dipendente();
		d.setNome("Nome");
		d.setCognome("Cognome");
		d.setDataDiNascita(new Date("09/22/1998"));
		d.setDataAssunzione(new Date("12/31/3000"));
		d.setRuolo(RuoliPossibili.Pasticciere);
		
		Manager m = new Manager();
		m.setNome("Nome");
		m.setCognome("Cognome");
		m.setDataAssunzione(new Date("11/11/2011"));
		m.setDataDiNascita(new Date("01/01/1961"));
		
		System.out.println(m);
		m.assumi(d);
		m.licenzia(d);
		
	}

}
