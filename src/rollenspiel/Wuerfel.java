package RPG;

import java.util.Random;

public class Wuerfel {
    private int anzahlSeiten;
    private Random zufall;

    public Wuerfel(int pAnzahlSeiten) {
        anzahlSeiten = pAnzahlSeiten;
        zufall = new Random();
    }

    public int wuerfeln() {
        return zufall.nextInt(anzahlSeiten) + 1;
    }
}
