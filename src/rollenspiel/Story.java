package RPG;

import lib.TIO;

public class Story {
    private Wuerfel zufall;

    private Held held;
    private Kampfregel regel;
    private Monster oculus;
    private Monster apple;
    private Spielecharakter[] gnulinuxbr;


    /*
    This isn't part of the actual code base and is only intended as a tech demo to show it all off
    */

    public static void main(String[] args) {
        new Story();
    }

    public Story() {
        regel = new Kampfregel();
        zufall = new Wuerfel(12);
        oculus = new Monster(2, 10);
        apple = new Monster(5, 50);
        gnulinuxbr = new Monster[10];
        for(int i=0; i<gnulinuxbr.length; i++)
            gnulinuxbr[i] = new Monster(zufall.wuerfeln(),zufall.wuerfeln());

        if (TIO.AnfrageString("Waehle Charakter: Z fuer Zauberer oder K fuer Krieger").toLowerCase().contains("k"))
            held = new Krieger(TIO.AnfrageString("Name:"), TIO.AnfrageInt("Staerke:"),
                    TIO.AnfrageInt("Lebenspunkte:"), TIO.AnfrageInt("Ausdauer:"));
        else
            held = new Zauberer(TIO.AnfrageString("Name:"), TIO.AnfrageInt("Staerke:"),
                    TIO.AnfrageInt("Lebenspunkte:"), TIO.AnfrageInt("Zauberkraft:"));

        TIO.prt("Tutorial: Y oder y fuer Ja.");
        TIO.prt("Tutorial: N oder n fuer Nein.");

        while (!TIO.AnfrageString("Moechtest du gegen das Boese in der Welt kaempfen?").toLowerCase().contains("y"))
            TIO.prt("Must du aber!");

        TIO.prt("Na dann, geh in die weite Welt und bekaempfe die greslichen Monster der polygopolischen und monopolistischen Maerkte!");
        TIO.prt("Du siehst ein Monster in der Ferne; es ist Oculus!");

        while (!TIO.AnfrageString("Moechtest du angreifen?").toLowerCase().contains("y"))
            TIO.prt("Komm schon, das ist ein einfacher Gegner.");

        while (oculus.getLebenspunkte() > 0) {
            held.angreifen(oculus, regel);
            TIO.prt(held.getName() + ": " + held.getLebenspunkte() + " HP");
            TIO.prt("Oculus: " + oculus.getLebenspunkte() + " HP");
        }

        TIO.prt("Gut gemacht! Die wollen anscheinend doch nicht deinen Facebook-login...");
        TIO.prt("Aber was ist da hinten? Ist das... Apple Inc.?");
        TIO.prt("");

        if (TIO.AnfrageString("Angreifen?").toLowerCase().contains("y")) {
            TIO.prt("Class action lawsuit, nice.");
            held.angreifen(apple, regel);
        }
        else {
            TIO.prt("Du merkst den geringen Akkustand deines iPhones und steckst es in die Mikrowelle, um es zu laden. Nach dem du es knallen hoerst fuegt dir der emotionale Schmerz " + apple.getAngriffswert() + " Schaden hinzu.");
            held.setLebenspunkte(held.getLebenspunkte() - apple.getAngriffswert());
            if (held.getLebenspunkte() <= 0) {
                TIO.prt("Du bist gestorben.");
                System.exit(0);
            }
            else if (held instanceof Zauberer)
                ((Zauberer)held).heilen();

            TIO.prt(held.getName() + ": " + held.getLebenspunkte() + "HP");
        }

        while (apple.getLebenspunkte() > 0) {
            held.angreifen(apple, regel);
            TIO.prt(held.getName() + ": " + held.getLebenspunkte() + " HP");
            TIO.prt("Apple: " + apple.getLebenspunkte() + " HP");
        }

        TIO.prt("Puh, das war nervig. Aber ist nun vorbei. Was dir jedoch auf faellt ist das epische Battle Royal ein paar hundert Meter vor dir.");
        TIO.prt("Jegliche GNU+Linux Distribution kaempft verbitterlich um die letzten uebrig gebliebenden Windowsnutzer. Alle schlachten sich ueber marginale Unterschiede ab.");

        // Geht einmal durch alle Distros durch
        for(int i=0; i<gnulinuxbr.length; i++){
            if( gnulinuxbr[i].getLebenspunkte() > 0){
                TIO.prt("Distro Nr. " + (i+1));
                TIO.prt("Distro HP: " + gnulinuxbr[i].getLebenspunkte());
                TIO.prt("Distro AP: " + gnulinuxbr[i].getAngriffswert());
                // Geht durch alle Distros bis auf die eigene durch
                for(int j=0; j<gnulinuxbr.length; j++){
                    if( i != j && gnulinuxbr[j].getLebenspunkte() > 0 && gnulinuxbr[i].getLebenspunkte() > 0) {
                        TIO.prt("   Kampf Nr. " + (j+1));
                        regel.kampf(gnulinuxbr[i], gnulinuxbr[j]);
                        TIO.prt("       Angreifer HP: " + gnulinuxbr[i].getLebenspunkte());
                        TIO.prt("       Verteidiger HP: " + gnulinuxbr[j].getLebenspunkte());
                    }
                }
            }
        }

        gnulinuxbr = Rangliste.SortByHealth(gnulinuxbr);
        
        for(int i=0; i<gnulinuxbr.length; i++)
            TIO.prt("Nr. " + (i+1) + " " + gnulinuxbr[i].getLebenspunkte());

        TIO.prt("You're winner!");
    }
}