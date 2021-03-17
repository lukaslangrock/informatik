package sorting;

import lib.Dice;

public class Test {
    public static void main(String[] args) {
        new Test(1000);
    }

    public Test(int samplesize) {
        System.out.println("[Speedtest] Initiating sorting algorythem speed & efficiency test...");

        int[] array = new int[samplesize];
        Dice dice = new Dice();

        // create random test array
        for (int i = 0; i < samplesize; i++) {
            array[i] = dice.getNumber(100);
        }

        Bubblesort bubblesort = new Bubblesort();
        Insertionsort insertionsort = new Insertionsort();
        Mergesort mergesort = new Mergesort();
        Selectionsort selectionsort = new Selectionsort();

        System.out.println("[Speedtest] Preparation done!\n");

        System.out.println("[Speedtest] Testing Bubblesort:");
        bubblesort.Entrypoint(array);
        System.out.println("[Speedtest] Bubblesort exited.\n");

        System.out.println("[Speedtest] Testing Selectionsort:");
        selectionsort.Entrypoint(array);
        System.out.println("[Speedtest] Selectionsort exited.\n");

        System.out.println("[Speedtest] Testing Insertionsort:");
        insertionsort.Entrypoint(array);
        System.out.println("[Speedtest] Insertionsort exited.\n");

        System.out.println("[Speedtest] Testing Mergesort:");
        mergesort.Entrypoint(array);
        System.out.println("[Speedtest] Mergesort exited.\n");
    }
}
