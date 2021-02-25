package rohrpost;

import lib.List;

public class Scanner {
    public boolean eingabeKorrekt(String pEingabe) {
        String pool = "|ab1234";
        for (char i : pEingabe.toCharArray()) {
            if (pool.indexOf(i) == -1) {
                return false; // exits the entire function
            }
        }
        return true; // return true if no error was found
    }

    List<Token> pruefeEingabe(String pEingabe) {
        List<Token> tokenlist = new List<Token>();

        for (char i : pEingabe.toCharArray()) {
            switch (i) {
                case '|':
                    tokenlist.append(new Token("Beginn", i));
                    break;

                case 'a':
                case 'b':
                    tokenlist.append(new Token("Etage", i));
                    break;

                case '1':
                case '2':
                case '3':
                case '4':
                    tokenlist.append(new Token("Flur", i));
                    break;

                default:
                    // tokenlist += new Token("Ignore", i);
                    break;
            }
        }

        return tokenlist;
    }
}
