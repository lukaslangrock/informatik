package chartree;

import lib.BinarySearchTree;

public class CharController {
    private BinarySearchTree<CharItem> tree;
    private String word;

    public CharController(String pInput) {
        tree = new BinarySearchTree<CharItem>();
        word = pInput;

        for (Character i : pInput.toCharArray()) {
            sortCharInTree(i);
        }
    }

    private void sortCharInTree(Character pInput) {
        CharItem item = new CharItem(pInput);
        CharItem existingItem = tree.search(item);

        if (existingItem == null) {
            tree.insert(item);
        } else {
            existingItem.incrementCount();
        }
    }

    public String getWord() {
        return word;
    }

    public BinarySearchTree<CharItem> getCharSearchTree() {
        return tree;
    }

    public int getCount(Character pInput) {
        CharItem item = new CharItem(pInput);
        CharItem existingItem = tree.search(item);

        if (existingItem == null) {
            return 0;
        } else {
            return existingItem.getCount();
        }
    }
}
