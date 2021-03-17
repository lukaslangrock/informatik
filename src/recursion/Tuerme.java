package recursion;

import lib.TIO;

public class Tuerme {
    /**
     * Gibt über die Konsole die Schritte an um Scheiben nach dem Prinzip "Türme von Hanoi" durch rekursion zu verschieben.
     */
    private int zuege;

    public static void main(String[] args) {
        new Tuerme();
    }
    
    public Tuerme(){
        TIO.cls();
        zuege = 0;
        SolvePuzzle(3,"Links", "Rechts", "Mitte");
        TIO.prt("Zuege: " + getZuege());
    }

    // Generiert die Anleitung zum Lösen des Puzzles
    public void SolvePuzzle(int anzahl, String vonStapel, String zuStapel, String hilfsStapel) {
        if (anzahl==1) {
            TIO.prt("Stapele eine Scheibe von " + vonStapel + " zu " + zuStapel);
        }
        else {
            SolvePuzzle(anzahl - 1, vonStapel, hilfsStapel, zuStapel);
            TIO.prt("Stapele eine Scheibe von " + vonStapel + " zu " + zuStapel);
            SolvePuzzle(anzahl - 1, hilfsStapel, zuStapel, vonStapel);
        }

        zuege++;
    }

    public int getZuege() {
        return zuege;
    }

    public void setZuege(int zuege) {
        this.zuege = zuege;
    }
}
