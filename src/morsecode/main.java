package morsecode;

import lib.TIO;

public class main {
    /**
     * Main method for running strings against the lalelu-langauge.
     */
    public static void main(String[] args) {
        String input = TIO.AnfrageString("Enter input to translate: ");

        Worker worker = new Worker();
        String output = worker.translate(input);

        TIO.prt("Translated output: '" + output + "'");
    }
}
