package recursion;

public class BinarySearch {
    public static void main(String[] args) {
        new BinarySearch();
    }

    public BinarySearch() {
        boolean result = BinarySearchIterative(new int[] { 1, 2, 3, 6, 8, 11, 16 }, 11);
        System.out.println(result);
    }

    public boolean BinarySearchIterative(int[] a, int i) {
        int links, mitte, rechts;
        links = 0;
        rechts = a.length - 1;
        while (links <= rechts) {
            mitte = (int) ((rechts + links) / 2);
            if (a[mitte] == i) {
                return true;
            }

            if (a[mitte] > i) {
                links = mitte - 1;
            } else {
                links = mitte + 1;
            }
        }
        return false;
    }
}
