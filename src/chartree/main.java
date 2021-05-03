package chartree;

import lib.TIO;

public class main {

    public static void main(String[] args) {
        CharController controller = null;
        boolean initialized = false;

        boolean repeat = true;
        do {
            TIO.prt("The following operations are avilable:");
            TIO.prt("1: Input new word");
            TIO.prt("2: Calculate number of occurrences of a specific character");
            TIO.prt("3: Exit");
            switch (TIO.AskInt("Select an option (1/2/3):")) {
                case 1:
                    controller = new CharController(TIO.AskString("Input word:"));
                    initialized = true;
                    TIO.prt("Word imported!\n");
                    break;

                case 2:
                    if (initialized) {
                        Character search = TIO.AskString("Input search char:").charAt(0);
                        int count = controller.getCount(search);
                        TIO.prt("Character '" + search + "' had " + count + " occurrences.\n");
                    }
                    break;

                case 3:
                    TIO.prt("Goodybe!\n");
                    repeat = false;
                    break;

                default:
                    TIO.prt("Error: This operations is not avilable!\n");
                    break;
            }
        } while (repeat);

        TIO.prt("Exiting...");
    }
}