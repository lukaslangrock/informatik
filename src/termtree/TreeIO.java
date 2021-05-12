package termtree;

import lib.BinaryTree;
import lib.Queue;

public class TreeIO {
    private static final String operatorPool = "+-/*";

    public static BinaryTree<String> treeFromPrefix(Queue<String> pInput) {
        BinaryTree<String> tree = new BinaryTree<String>();

        if (pInput.isEmpty()) {
            return null;
        }

        tree.setContent(pInput.front());
        pInput.dequeue();

        tree.setLeftTree(treeFromPrefix(pInput));
        tree.setRightTree(treeFromPrefix(pInput));

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

        prefix += String.valueOf(pInput.getContent());
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
            infix += treeToInfix(pInput.getLeftTree());
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
            postfix += treeToPostfix(pInput.getLeftTree());
        }
        if (!pInput.getRightTree().isEmpty()) {
            postfix += treeToPostfix(pInput.getRightTree());
        }
        postfix += String.valueOf(pInput.getContent());

        return postfix;
    }
}
