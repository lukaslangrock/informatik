package Sortieralgorythmen;

public class Bubblesort {
    public int[] Entrypoint(int[] array) {
        System.out.println("[Bubblesort] Starting Bubblesort...");
        long compareTracker = 0;
        long swapTracker = 0;
        boolean doneTracker = false;
        int maxIndex = array.length - 1;

        while (!doneTracker) {
            doneTracker = true;
            // System.out.println("[Bubblesort] Looping array...");
            for (int i = 0; i < maxIndex; i++) {
                compareTracker++;
                if (array[i] > array[i + 1]) {
                    array = SwapArrayPositionsbyIndex(i, i + 1, array);
                    swapTracker++;
                    doneTracker = false;
                }
            }
            maxIndex--;
        }

        System.out.println("[Bubblesort] Array sorted.");
        System.out.println("[Bubblesort] Stats: " + compareTracker + " comparisons | " + swapTracker + " swaps");
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
        // System.out.println("[Bubblesort] Swapping " + array[index1] + "(" + index1 +
        // ") with " + array[index2] + "(" + index2 + ").");
        int indexValue = array[index1];
        array[index1] = array[index2];
        array[index2] = indexValue;

        return array;
    }
}
