public enum RuoliPossibili {
	Pasticciere, Gestore, Operaio_pulizie, Cassiere;

	public static boolean contains(String ingredient) {
		for (IngredientiPossibili v : IngredientiPossibili.values()) {
			if (v.name().equals(ingredient)) {
				return true;
			}
		}
		return false;
	}
}