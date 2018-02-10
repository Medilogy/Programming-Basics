package countingSort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 3, 5, 6, 4, 7, 8, 2, 3, 2, 9, 0, 7, 5, 1, 2, 1, 5, 6, 9, 0, 5, 3, 9, 8, 7, 6};
        countingSort(inputArray);
    }

    public static void countingSort(Integer[] inputArray) {
        int maxValue = Arrays.stream(inputArray).max(Integer::compareTo).get();
        Integer[] sumArray = new Integer[maxValue + 1];
        Arrays.fill(sumArray, 0);
        for (int i = 0; i < inputArray.length; i++) {
            Integer key = inputArray[i];
            sumArray[key]++;

        }
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] += sumArray[i - 1];

        }
        Integer[] resultArray = new Integer[inputArray.length];
        for (int i = inputArray.length - 1; i >= 0 ; i--) {
            Integer key = inputArray[i];
            Integer newKey = sumArray[key]--;
            resultArray[newKey - 1] = key;

        }
        System.out.println(Arrays.asList(resultArray).toString());
    }
}