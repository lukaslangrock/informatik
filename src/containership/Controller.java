package containership;

import lib.TIO;

public class Controller {
    public static void main(String[] args) {
        TIO.prt("Initializing Containership...");
        Containership ship = new Containership(TIO.AskInt("Height of Conatinership:"),
                TIO.AskInt("Rows of Conatinership:"));
        TIO.prt("Containership initialized ✔");

        do {
            TIO.prt("\nWhat do you want to do?");
            TIO.prt("create: Create new container");
            TIO.prt("get-first: Get frist container from specific row");
            TIO.prt("get-priority: Get all containers with specific priority");
            TIO.prt("purge: Purge entire containership");

            switch (TIO.AskString("Select option: ".toLowerCase())) {
                case "exit":
                    break;

                case "create":
                    break;

                case "get-first":
                    Container firstContainer = ship.getFirstContainerFromRow(TIO.AskInt("Select row:"), false);
                    TIO.prt(firstContainer.getContentType().toString());
                    break;

                case "get-priority":
                    //Container[] data2array = ship.getAllContainersWithPriority(TIO.AskInt("Select priority:"), false);
                    //TIO.prt(data2);
                    break;

                case "purge":
                    ship.purgeContainers();
                    break;
            }
        } while (TIO.AskString("\nContinue? ").toLowerCase().equals("yes"));

        TIO.prt("\nGoodbye.");
    }
}
