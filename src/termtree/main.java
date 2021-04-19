package termtree;

import lib.TIO;

public class main {
    public static void main(String[] args) {
        boolean allowMainExit = true; // set to false to restart termtree main
        boolean restartLoop = true; // set to true to automatically restart the loop without asking
        boolean forceExitLoop = false; // set to true to automatically exit the loop without asking, overrides 

        do {
            Termtree termtree = new Termtree();
            int importFormat = TIO.AskInt("Import a termtree using prefix[1], infix[2], or postfix[3]: ");
            String importString = TIO.AskString("Paste your tree: ");

            switch (importFormat) {
            case 1:
                termtree.importFromPrefix(importString);
                TIO.prt("Termtree was imported from Prefix!\n");
                break;

            case 2:
                termtree.importFromInfix(importString);
                TIO.prt("Termtree was imported from Infix!\n");
                break;

            case 3:
                termtree.importFromPostfix(importString);
                TIO.prt("Termtree was imported from Postfix!\n");
                break;

            default:
                TIO.prt("Invalid importing option! Please select 1, 2, or 3.");
                restartLoop = false;
                allowMainExit = false;
                break;
            }

            
            while (restartLoop) {
                restartLoop = false; // makes the user select to restart/cancel
                int exportFormat = TIO.AskInt("Would you like to export[1] the termtree or import[2] a new one? [1/2]: ");

                switch (exportFormat) {
                case 1:
                    TIO.prt("Prefix: " + termtree.exportToPrefix());
                    TIO.prt("Infix: " + termtree.exportToInfix());
                    TIO.prt("Postfix: " + termtree.exportToPostfix());
                    break;

                case 2:
                    TIO.prt("Purging termtree...");
                    forceExitLoop = true;
                    allowMainExit = false;
                    break;

                default:
                    TIO.prt("Invalid exporting option! Please select 1, 2, 3, or 4.");
                    restartLoop = true;
                    break;
                }

                // exit or restart logic
                if (forceExitLoop) {
                    restartLoop = false; // forceExitLoop overrides restartLoop = true
                }
                if (!restartLoop && TIO.AskString("Do you wish to continue? [y/N]: ").equals("y")) { // ask user to rstart/cancel if forceExit = false && cancelExit = false 
                    restartLoop = true; // do not restart loop upon user request
                }
            }
        } while (!allowMainExit);
    }
}