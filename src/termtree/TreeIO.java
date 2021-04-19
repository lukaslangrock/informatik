package termtree;

import lib.BinaryTree;

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

            // rekursion: left tree mit pInput[] -1 aktueller i
            // rekursion same but right
        }

        return tree;
    }

    public static BinaryTree<Termchar> treeFromInfix(Termchar[] pInput) {
        return null;
    }

    public static BinaryTree<Termchar> treeFromPostfix(Termchar[] pInput) {
        return null;
    }

    public static Termchar[] treeToPrefix(BinaryTree<Termchar> pInput) {
        return null;
    }

    public static Termchar[] treeToInfix(BinaryTree<Termchar> pInput) {
        return null;
    }

    public static Termchar[] treeToPostfix(BinaryTree<Termchar> pInput) {
        return null;
    }
}
