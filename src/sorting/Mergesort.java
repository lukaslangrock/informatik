package Sortieralgorythmen;

import java.util.Random;

import lib.TIO;

public class Mergesort {
    private long recursionTracker, compareTracker, appendTracker;

    public int[] Entrypoint(int[] array) {
        recursionTracker = 0;
        compareTracker = 0;
        System.out.println("[Mergesort] Starting Mergesort...");

        array = sort(array);

        System.out.println("[Mergesort] Array sorted.");
        System.out.println("[Mergesort] Stats: " + compareTracker + " comparisons | " + recursionTracker + " recursions");

        return array;
    }

    private int[] sort(int[] array) {
        if (array.length <= 1) { return array; }

        // create two split arrays
        int middleIndex = Math.round(array.length / 2);
        int[] leftArray = new int[middleIndex];
        int[] rightArray = new int[array.length - middleIndex];

        // fill the split arrays
        for (int i = 0; i < array.length; i++) {
            compareTracker++;
            if (i < middleIndex) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - middleIndex] = array[i];
            }
        }

        // recursion
        recursionTracker += 2;
        leftArray = sort(leftArray);
        rightArray = sort(rightArray);

        // merge
        int leftPointer = 0;
        int rightPointer = 0;
        for (int i = 0; i < array.length; i++) {
            compareTracker++;
            if (leftArray[leftPointer] < rightArray[rightPointer]) {
                array[i] = leftArray[leftPointer];
                leftPointer++;
            } else {
                array[i] = rightArray[rightPointer];
                rightPointer++;
            }
        }

        return array;
    }
}
