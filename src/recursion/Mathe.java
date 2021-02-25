package Rekursion;

public class Mathe {
    /* Aufgabe S. 105 Nr. 2 */

    final int defaultInput = 5;
    final boolean logging = true;

    public static void main(String[] args) {
        new Mathe();
    }

    public Mathe() {
        System.out.println(
                "Ausführung der Funktion mit Eingabe '" + defaultInput + "' ergab: '" + Funktion(defaultInput) + "'");
    }

    public int Funktion(int zahl) {
        if (logging) {
            System.out.println("[internal] Running calculation for " + zahl);
        }

        if (zahl > 1) {
            return zahl * Funktion(zahl - 1);
        } else if (zahl == 1) {
            return 1;
        } else if (zahl == 0) {
            return 0;
        } else {
            throw new IllegalArgumentException("Input muss eine natürliche Zahl sein!");
        }
    }
}
