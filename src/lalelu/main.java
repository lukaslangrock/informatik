package lalelu;

import lib.TIO;

public class main {
    /**
     * Main method for running strings against the lalelu-langauge.
     */
    public static void main(String[] args) {
        String input = TIO.AskString("Enter input to check: ");
        TIO.prt("Running '" + input + "' against Scanner...");

        Scanner scanner = new Scanner();
        if (scanner.scan(input)) {
            TIO.prt("Scanner Check: PASS");
        }
        else { TIO.prt("Scanner Check: FAIL!"); }
    }
}
