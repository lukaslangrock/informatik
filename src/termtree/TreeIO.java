package termtree;

import lib.BinaryTree;
import lib.Queue;

public class TreeIO {
    private static final String operatorPool = "+-/*";

    static public BinaryTree<String> treeFromPrefix(Queue<String> pTreeQueue)
    {
        if(!pTreeQueue.isEmpty())
        {
        BinaryTree<String> outTree = new BinaryTree<String>(pTreeQueue.front());
        pTreeQueue.dequeue();
        try{
            Double.parseDouble(outTree.getContent());
        }
        catch(NumberFormatException e)
        {
            outTree.setLeftTree(treeFromPrefix(pTreeQueue));
            outTree.setRightTree(treeFromPrefix(pTreeQueue));
        }
        return outTree;
        }
        else{
            return null;
        }
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
