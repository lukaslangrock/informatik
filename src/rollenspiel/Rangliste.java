package rollenspiel;

public class Rangliste {

    //public void CollectData() {}

    public static Spielecharakter[] SortByHealth(Spielecharakter[] charaktere)
    {
        int[] array = new int[charaktere.length];

        for (int i = 0; i < array.length; i++)
            array[i] = charaktere[i].getLebenspunkte();

        array = InsertionSort(array);

        for (int i = 0; i < array.length; i++)
            charaktere[i].setLebenspunkte(array[i]);

        return charaktere;
    }

    public static int[] InsertionSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            int j = i;
            temp = array[i];
            while (j > 0 && array[j - 1] < temp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
        }

        return array;
    }
}