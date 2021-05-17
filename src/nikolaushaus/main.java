package nikolaushaus;

import lib.TIO;

public class main {
    public static void main(String args[]) {
        TIO.prt("Starting Nikolausbaum");
        Nikolaushaus nikolaushaus = new Nikolaushaus();

        boolean allowExit = false;
        do {
            String way = TIO.AskString("\nInput a way you want to check (leave empty to exit):");
            if (way.isEmpty()) {
                allowExit = true;
            } else {
                if (nikolaushaus.checkWay(way)) {
                    TIO.prt("Yay, your way is valid!");
                } else {
                    TIO.prt("Sorry, your way was invalid!");
                }
            }
        } while (allowExit);
    }
}
