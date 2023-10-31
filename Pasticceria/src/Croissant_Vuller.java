
public class Croissant_Vuller extends Prodotto {

	public boolean riempi(String r) {
		for (riempimento v : riempimento.values()) {
			if (v.name().equals(r)) {
				return true;
			}
		}
		return false;
	}

	private enum riempimento {
		cioccolato, crema, crema_amarena, pistacchio
	}
}
