package socialnetwork;

import lib.TIO;

public class main {
    public static void main(String args[]) {
        TIO.prt("Welcome to The Social Network!\n");

        SocialNetwork socialnetwork = new SocialNetwork();

        TIO.prt("\n-- [Network stats] -- \n");
        TIO.prt("Density: " + socialnetwork.getDensity());

        boolean allowExit = false;
        do {
            String searchterm = TIO.AskString("\nEnter name of user to get centrality from (leave blank to exit): ");
            if (searchterm.isEmpty()) {
                allowExit = true;
            } else {
                TIO.prt("User has a centrality value of " + socialnetwork.getCentrality(socialnetwork.getVertexOfUser(searchterm)));
            }
        } while (!allowExit);
    }
}
