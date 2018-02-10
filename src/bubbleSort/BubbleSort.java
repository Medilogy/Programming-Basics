package bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        Integer[] tab = {3, 4, 5, 2, 1};
        int i, j, temp, f;
        System.out.println("Zawartosc tablicy: ");

        for (i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");

        System.out.println();
        for (i = 0; i < tab.length - 1; i++) {
            for (j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Posortowana tablica: ");
        for (i = 0; i < tab.length; i++)
            System.out.print(tab[i] + " ");

    }
}



