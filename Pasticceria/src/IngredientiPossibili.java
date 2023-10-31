
public enum IngredientiPossibili {
	Farina, Cioccolato, Cioccolato_Fondente, Cioccolato_Bianco, Arancia, Rum, Ovomaltina, Zucchero_a_velo, Panna,
	Fragole, Mango;

	public static boolean contains(String ingredient) {
		for (IngredientiPossibili v : IngredientiPossibili.values()) {
			if (v.name().equals(ingredient)) {
				return true;
			}
		}
		return false;
	}
}