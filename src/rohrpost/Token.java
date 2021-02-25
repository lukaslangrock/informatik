package rohrpost;

public class Token {
    private final String bezeichner;
    private final char symbol;

    public Token(String pBezeichner, char pSymbol) {
        bezeichner = pBezeichner;
        symbol = pSymbol;
    }

    public String getBezeichner() {
        return bezeichner;
    }

    public char getSymbol() {
        return symbol;
    }
}
