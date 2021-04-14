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

    public boolean importFromPrefix() {
        // boolean returns true if the import was successful.
        return false;
    }

    public boolean importFromInfix() {
        // boolean returns true if the import was successful.
        return false;
    }

    public boolean importFromPostfix() {
        // boolean returns true if the import was successful.
        return false;
    }

    public String exportToPreorder() {
        return null;
    }

    public String exportToInorder() {
        return null;
    }

    public String exportToPostorder() {
        return null;
    }
}
