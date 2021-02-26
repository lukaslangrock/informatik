package lalelu;

public class Token {
    private final String bezeichner;
    private final String data;

    public Token(String pBezeichner, String pData) {
        bezeichner = pBezeichner;
        data = pData;
    }

    public String getBezeichner() {
        return bezeichner;
    }

    public String getData() {
        return data;
    }
}
