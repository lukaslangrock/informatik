package termtree;

public class Termchar {
    private char content;
    private boolean isOperator;

    public Termchar(char pInput, boolean pIsOperator) {
        content = pInput;
        isOperator = pIsOperator;
    }

    public char getContent() { return content; }
    public boolean getIsOperator() { return isOperator; }
}
