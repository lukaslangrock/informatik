package sorting;

public class Selectionsort {
    public int[] Entrypoint(int[]array)
    {
        System.out.println("[Selectionsort] Starting Selectionsort...");
        long compareTracker = 0;
        long swapTracker = 0;
        int currentMinimum;

        for (int i = 0; i < array.length - 1; i++)
        {
            currentMinimum = i;
            for (int j = i + 1; j < array.length; j++)
            {
                compareTracker++;
                if (array[j] < array[currentMinimum]) { currentMinimum = j; }
            }
            if (currentMinimum != i)
            {
                compareTracker++;
                swapTracker++;
                array = SwapArrayPositionsbyIndex(i, currentMinimum, array);
            }
        }

        System.out.println("[Selectionsort] Array sorted.");
        System.out.println("[Selectionsort] Stats: " + compareTracker + " comparisons | " + swapTracker + " swaps");
        return array;
    }

    /**
     * Swaps the positions of two elements in an array.
     * @param index1 Index to switch with the other index
     * @param index2 The other index
     * @returns The modified array
     */
    public int[] SwapArrayPositionsbyIndex(int index1, int index2, int[] array)
    {
        //System.out.println("[Selectionsort] Swapping " + array[index1] + "(" + index1 + ") with " + array[index2] + "(" + index2 + ").");
        int indexValue = array[index1];
        array[index1] = array[index2];
        array[index2] = indexValue;

        return array;
    }
}
