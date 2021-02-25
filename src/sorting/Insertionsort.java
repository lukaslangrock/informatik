package Sortieralgorythmen;

public class Insertionsort {
    public int[] Entrypoint(int[] array) {
        System.out.println("[Insertionsort] Starting Insertionsort...");
        long compareTracker = 0;
        long swapTracker = 0;

        for (int i = 1; i < array.length; i++) {
            int j = i;
            compareTracker++;
            while (j > 0 && array[j - 1] > array[j]) {
                array = SwapArrayPositionsbyIndex(j, j - 1, array);
                compareTracker++;
                swapTracker++;
                j--;
            }
        }

        System.out.println("[Insertionsort] Array sorted.");
        System.out.println("[Insertionsort] Stats: " + compareTracker + " comparisons | " + swapTracker + " swaps");
        return array;
    }

    /**
     * Swaps the positions of two elements in an array.
     * 
     * @param index1 Index to switch with the other index
     * @param index2 The other index
     * @returns The modified array
     */
    public int[] SwapArrayPositionsbyIndex(int index1, int index2, int[] array) {
        // System.out.println("[Insertionsort] Swapping " + array[index1] + "(" + index1
        // + ") with " + array[index2] + "(" + index2 + ").");
        int indexValue = array[index1];
        array[index1] = array[index2];
        array[index2] = indexValue;

        return array;
    }
}
