package bubbleSort;

public class BubbleSort3 {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 7, 3, 7, 3, 9, 1, 4};
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void bubbleSort(Integer[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            boolean noStop = false;
            for (int j = 0; j < size -1 ; j++) {
                if (array[j] > array[j + 1]) {
                    noStop = true;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            if(!noStop){
                break;
            }
        }
    }
}
