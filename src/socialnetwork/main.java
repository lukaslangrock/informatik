package socialnetwork;

import lib.TIO;

public class main {
    public static void main(String args[]) {
        TIO.prt("Welcome to The Social Network!\n");

        SocialNetwork socialnetwork = new SocialNetwork();

        TIO.prt("\n-- [Network stats] -- \n");
        TIO.prt("Density: " + socialnetwork.getDensity());
    }
}
