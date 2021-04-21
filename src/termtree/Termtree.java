package termtree;

import lib.BinaryTree;
import lib.Queue;

public class Termtree {
    private BinaryTree<String> tree;

    public Termtree() {
        tree = new BinaryTree<String>();
    }

    public BinaryTree<String> getContent() {
        return tree;
    }

    public void importFromPrefix(String pInput) {
        Queue<String> queue = new Queue<String>();
        for(int i = 0; i<pInput.length(); i++) {
            queue.enqueue(String.valueOf(pInput.charAt(i)));
          }
        tree = TreeIO.treeFromPrefix(queue);
    }

    public void importFromInfix(String pInput) {
        tree = TreeIO.treeFromInfix(pInput);
    }

    public void importFromPostfix(String pInput) {
        tree = TreeIO.treeFromPostfix(pInput);
    }

    public String exportToPrefix() {
        return TreeIO.treeToPrefix(tree);
    }

    public String exportToInfix() {
        return TreeIO.treeToInfix(tree);
    }

    public String exportToPostfix() {
        return TreeIO.treeToPostfix(tree);
    }
}
