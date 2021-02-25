package lib;

import java.util.Scanner;

public class TIO {
    //private Scanner eingabe;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String COLOR_OUTPUT = ANSI_CYAN;
    public static final String COLOR_QUESTION = ANSI_GREEN;

    // Shorthand for System.out.println(x);
    static public void prt(String x){
        System.out.println(COLOR_OUTPUT + x + ANSI_RESET);
    }

    // clear Terminal
    static public void cls() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }

    static public String AnfrageString(String pAnfrage){
        System.out.println(COLOR_QUESTION + pAnfrage + ANSI_RESET);

        String text;
        Scanner eingabe = new Scanner(System.in);
        try{
            text = eingabe.nextLine();
        }
        catch(Exception InputMismatchException){
            text = AnfrageString(pAnfrage);
        }
        eingabe.close();
        return text;
    }

    static public int AnfrageInt(String pAnfrage){
        System.out.println(COLOR_QUESTION + pAnfrage + ANSI_RESET);

        int integer;
        Scanner eingabe = new Scanner(System.in);
        try{
            integer = eingabe.nextInt();
        }
        catch(Exception InputMismatchException){
            integer = AnfrageInt(pAnfrage);
        }
        eingabe.close();
        return integer;
    }

    static public double AnfrageDouble(String pAnfrage){
        System.out.println(COLOR_QUESTION + pAnfrage + ANSI_RESET);

        double komma;
        Scanner eingabe = new Scanner(System.in);
        try{
            komma = eingabe.nextDouble();
        }
        catch(Exception InputMismatchException){
            komma = AnfrageDouble(pAnfrage);
        }
        eingabe.close();
        return komma;
    }
}