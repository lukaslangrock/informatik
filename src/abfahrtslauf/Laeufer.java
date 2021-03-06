package abfahrtslauf;

/**
 * Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule,
 * Materialien zum schulinternen Lehrplan Informatik SII
 */
public class Laeufer {
	// Attribute
	String zName;
	String zLand;
	int zZeit;

	// Konstruktor
	/**
	 * nachher: Der Abfahrtslaeufer wird mit dem Namen, Land und Zeit initialisiert.
	 */
	public Laeufer(String pName, String pLand, int pZeit) {
		zName = pName;
		zLand = pLand;
		zZeit = pZeit;
	}

	// Dienste
	/**
	 * nachher: Der Name des Abfahrtslaeufers wird geliefert.
	 */
	public String name() {
		return zName;
	}

	/**
	 * nachher: Das Land des Abfahrtslaeufers wurde geliefert.
	 */
	public String land() {
		return zLand;
	}

	/**
	 * nachher: Die Laufzeit des Abfahrtslaeufers wurde geliefert.
	 */
	public int zeit() {
		return zZeit;
	}

	/**
	 * nachher: Die Daten des Abfahrtslaeufers wurden als Zeichenkette geliefert.
	 */
	public String toString() {
		String lDaten = zName + " (" + zLand + ")";
		if (zZeit != 0)
			lDaten = lDaten + ": " + zZeit;
		return lDaten;
	}
}