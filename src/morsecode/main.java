package morsecode;

import lib.TIO;

public class main {
    /**
     * Main method for running strings against the lalelu-langauge.
     */
    public static void main(String[] args) {
        String reverseMode = TIO.AskString("Do you wish to translate an input to morse [n] vor in reverse [y]?");

        if (reverseMode.equals("n")) {
            String input = TIO.AskString("Enter input to translate: ");

            Worker worker = new Worker();
            String output = worker.translateToChar(input);
    
            TIO.prt("Translated output: '" + output + "'");
        } else if (reverseMode.equals("y")) {
            String input = TIO.AskString("Enter input to translate: ");

            Worker worker = new Worker();
            String output = worker.translateStringToMorse(input);
    
            TIO.prt("Translated output: '" + output + "'");
        }
    }
}
