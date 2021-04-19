package termtree;

import lib.BinaryTree;

public class Termtree {
    private BinaryTree<Termchar> tree;

    public Termtree() {
        tree = new BinaryTree<Termchar>();
    }

    public BinaryTree<Termchar> getContent() {
        return tree;
    }

    private Termchar[] stringToTermchars(String pInput) {
        Termchar[] termchars = new Termchar[pInput.length()];
        for (int i = 0; i < pInput.length(); i++) {
            termchars[i] = new Termchar(pInput.charAt(i));
        } return termchars;
    }

    private String stringFromTermchars(Termchar[] pInput) {
        String output = new String();
        for (Termchar tc : pInput) {
            output += tc.getContent();
        } return output;
    }

    public void importFromPrefix(String pInput) {
        Termchar[] inputChars = stringToTermchars(pInput);
        tree = TreeIO.treeFromPrefix(inputChars);
    }

    public void importFromInfix(String pInput) {
        Termchar[] inputChars = stringToTermchars(pInput);
        tree = TreeIO.treeFromInfix(inputChars);
    }

    public void importFromPostfix(String pInput) {
        Termchar[] inputChars = stringToTermchars(pInput);
        tree = TreeIO.treeFromPostfix(inputChars);
    }

    public String exportToPrefix() {
        Termchar[] outputChars = TreeIO.treeToPrefix(tree);
        return stringFromTermchars(outputChars);
    }

    public String exportToInfix() {
        Termchar[] outputChars = TreeIO.treeToInfix(tree);
        return stringFromTermchars(outputChars);
    }

    public String exportToPostfix() {
        Termchar[] outputChars = TreeIO.treeToPostfix(tree);
        return stringFromTermchars(outputChars);
    }
}
