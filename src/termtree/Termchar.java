package termtree;

public class Termchar {
    private char content;
    private final boolean isOperator;
    private final boolean isNumber;
    private final String operatorPool = "+-/*";

    public Termchar(char pInput) {
        content = pInput;
        if (operatorPool.indexOf(pInput) != -1) { // check if input char is an operator by checking if the char is inside the pool of operator chars
            isOperator = true;
        } else { isOperator = false; }
        if (Character.isDigit(pInput)) { // check if input is a number
            isNumber = true;
        } else { isNumber = false; }
    }

    public char getContent() { return content; }
    public boolean getIsOperator() { return isOperator; }
    public boolean getIsNumber() { return isNumber; }
}
