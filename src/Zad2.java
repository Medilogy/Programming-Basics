public class Zad2 {

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 78, 3};
        printArrayElements(arr);
    }

    private static void printArrayElements(Integer[] array) {
        if (array.length > 0) {
            Integer max = array[0];
            int maxIndex = 0;
            Integer min = array[0];
            int minIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }

            }
            System.out.println("Max: " + maxIndex + " " + max);
            System.out.println("Min: " + minIndex + " " + min);
        }
    }

}
