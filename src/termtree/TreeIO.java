package termtree;

import lib.BinaryTree;
import lib.List;

public class TreeIO {
    private static Termchar[] subTermtreeArray(Termchar[] pInput) {
        Termchar[] output = new Termchar[pInput.length -1];
        for (int i = 1; i < pInput.length - 1; i++) {
            output[i -1] = pInput[i];
        }
        return output;
    }

    public static BinaryTree<Termchar> treeFromPrefix(Termchar[] pInput) {
        BinaryTree<Termchar> tree = new BinaryTree<Termchar>();
        if (pInput == null || Character.isWhitespace(pInput[0].getContent())) {
            return null;
        }

        tree.setContent(pInput[0]);
        if (pInput[0].getIsOperator()) {
            tree.setLeftTree(treeFromPrefix(subTermtreeArray(pInput)));
            tree.setRightTree(treeFromPrefix(subTermtreeArray(pInput)));
        }

        return tree;
    }

    public static BinaryTree<Termchar> treeFromInfix(Termchar[] pInput) {
        return null;
    }

    public static BinaryTree<Termchar> treeFromPostfix(Termchar[] pInput) {
        return null;
    }

    public static String treeToPrefix(BinaryTree<Termchar> pInput) {
        String prefix = new String();

        prefix = String.valueOf(pInput.getContent().getContent());
        if (!pInput.getLeftTree().isEmpty()) {
            prefix += treeToPrefix(pInput.getLeftTree());
        }
        if (!pInput.getRightTree().isEmpty()) {
            prefix += treeToPrefix(pInput.getRightTree());
        }

        return prefix;
    }

    public static String treeToInfix(BinaryTree<Termchar> pInput) {
        String infix = new String();

        if (!pInput.getLeftTree().isEmpty()) {
            infix = treeToInfix(pInput.getLeftTree());
        }
        infix += String.valueOf(pInput.getContent().getContent());
        if (!pInput.getRightTree().isEmpty()) {
            infix += treeToInfix(pInput.getRightTree());
        }

        return infix;
    }

    public static String treeToPostfix(BinaryTree<Termchar> pInput) {
        String postfix = new String();

        if (!pInput.getLeftTree().isEmpty()) {
            postfix = treeToPostfix(pInput.getLeftTree());
        }
        if (!pInput.getRightTree().isEmpty()) {
            postfix += treeToPostfix(pInput.getRightTree());
        }
        postfix += String.valueOf(pInput.getContent().getContent());

        return postfix;
    }
}
