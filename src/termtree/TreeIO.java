package termtree;

import lib.BinaryTree;

public class TreeIO {
    private static final String operatorPool = "+-/*";

    public static BinaryTree<String> treeFromPrefix(String pInput) {
        BinaryTree<String> tree = new BinaryTree<String>();
        if (pInput == null || Character.isWhitespace(pInput.charAt(0))) {
            return null;
        }

        tree.setContent(String.valueOf(pInput.charAt(0)));
        if (operatorPool.indexOf(pInput.charAt(0)) != -1) { // check if start of input string is an operator
            tree.setLeftTree(treeFromPrefix(pInput.substring(1)));
            tree.setRightTree(treeFromPrefix(pInput.substring(1)));
        }

        return tree;
    }

    public static BinaryTree<String> treeFromInfix(String pInput) {
        return null;
    }

    public static BinaryTree<String> treeFromPostfix(String pInput) {
        return null;
    }

    public static String treeToPrefix(BinaryTree<String> pInput) {
        String prefix = new String();

        prefix = String.valueOf(pInput.getContent());
        if (!pInput.getLeftTree().isEmpty()) {
            prefix += treeToPrefix(pInput.getLeftTree());
        }
        if (!pInput.getRightTree().isEmpty()) {
            prefix += treeToPrefix(pInput.getRightTree());
        }

        return prefix;
    }

    public static String treeToInfix(BinaryTree<String> pInput) {
        String infix = new String();

        if (!pInput.getLeftTree().isEmpty()) {
            infix = treeToInfix(pInput.getLeftTree());
        }
        infix += String.valueOf(pInput.getContent());
        if (!pInput.getRightTree().isEmpty()) {
            infix += treeToInfix(pInput.getRightTree());
        }

        return infix;
    }

    public static String treeToPostfix(BinaryTree<String> pInput) {
        String postfix = new String();

        if (!pInput.getLeftTree().isEmpty()) {
            postfix = treeToPostfix(pInput.getLeftTree());
        }
        if (!pInput.getRightTree().isEmpty()) {
            postfix += treeToPostfix(pInput.getRightTree());
        }
        postfix += String.valueOf(pInput.getContent());

        return postfix;
    }
}
