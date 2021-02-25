package Rekursion;

import lib.Dice;
import lib.List;

public class Selectionsort {
    public static void main(String[] args) {
        new Selectionsort();
    }

    public Selectionsort() {
        System.out.println("Preparing Selectionsort...");
        Dice dice = new Dice();
        List<Integer> list = new List<Integer>();
        int lenght = dice.getNumber(1000);

        System.out.println("Generating random data...");
        while (lenght > 1) {
            list.append(dice.getNumber(1000));

            lenght--;
        }

        System.out.println("Running Selectionsort against random data...");
        list = sort(list);

        System.out.println("Selectionsort done!");
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

            sorted.append(temp); 

            list.toFirst();
            while (list.getContent() != temp) {
                list.next();
            }
            list.remove();
        }

        return sorted;
    }
}