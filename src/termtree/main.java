package termtree;

import lib.TIO;

public class main {
    public static void main(String[] args) {
        boolean restartLoop; // used to determine if the loop should restart (user: y/n)
        boolean forceRestart; // set to true to automatically restart the loop without asking, overrides restartLoop
        boolean treeImported; // only export the tree if it was successfully imported

        do {
            restartLoop = false;
            forceRestart = false;
            treeImported = false;

            Termtree termtree = new Termtree();
            int importFormat = TIO.AskInt("Import a termtree using prefix[1], infix[2], or postfix[3]: ");
            String importString = TIO.AskString("Paste your tree: ");

            switch (importFormat) {
                case 1:
                    termtree.importFromPrefix(importString);
                    treeImported = true;
                    TIO.prt("Termtree was imported from Prefix!\n");
                    break;

                case 2:
                    termtree.importFromInfix(importString);
                    treeImported = true;
                    TIO.prt("Termtree was imported from Infix!\n");
                    break;

                case 3:
                    termtree.importFromPostfix(importString);
                    treeImported = true;
                    TIO.prt("Termtree was imported from Postfix!\n");
                    break;

                default:
                    TIO.prt("Invalid importing option! Please select 1, 2, or 3.");
                    forceRestart = true;
                    break;
            }

            if (treeImported) {
                TIO.prt("Prefix: " + termtree.exportToPrefix());
                TIO.prt("Infix: " + termtree.exportToInfix());
                TIO.prt("Postfix: " + termtree.exportToPostfix());
            }

            if (forceRestart || TIO.AskString("\nDo you wish to continue? [y/N]: ").equals("y")) {
                restartLoop = true;
            }
        } while (restartLoop);
    }
}