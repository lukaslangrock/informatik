package Rekursion;

import lib.Dice;
import lib.List;

public class QuickSort {
    public static void main(String[] args) {
        new QuickSort();
    }

    public QuickSort() {
        System.out.println("Preparing Quicksort...");
        Dice dice = new Dice();
        List<Integer> list = new List<Integer>();
        int lenght = dice.getNumber(1000);

        System.out.println("Generating random data...");
        while (lenght > 1) {
            if (list.isEmpty()) {
                list.insert(dice.getNumber(1000));
            }
            else {
                list.append(dice.getNumber(1000));
            }

            lenght--;
        }

        System.out.println("Running Quicksort against random data...");
        list = sort(list);

        System.out.println("Quicksort done!");
        System.out.println("List:\n");
        list.toFirst();
        while (list.hasAccess()) {
            System.out.println(list.getContent());
            list.next();
        }
    }

    public List<Integer> sort(List<Integer> list) {
        List<Integer> sorted = new List<Integer>();

        while (!list.isEmpty()) {
            list.toFirst();
            int temp = list.getContent();
            list.next();

            while (list.hasAccess()) {
                if (list.getContent() < temp) {
                    temp = list.getContent();
                }
                list.next();
            }

            if (sorted.isEmpty()) {
                sorted.insert(temp);
            } else { sorted.append(temp); }

            list.toFirst();
            while (list.getContent() != temp) {
                list.next();
            }
            list.remove();
        }

        return sorted;
    }
}