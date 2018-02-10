package quickSort;

public class QuickSort {
    public static void main(String[] args) {
        int[] inputArray = {7, 2, 5, 3, 4, 6, 2};
        quickSort(inputArray, 0, inputArray.length);
    }

    private static void quickSort(int[] inputArray, int start, int end) {

        int pivot = start + end / 2;
        int lastIndex = start + end - 1;
        if (end < start){
            return;
        }
        int tempValue = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[pivot];
        inputArray[pivot] = tempValue;
        int j = 0;
        for (int i = 0; i < lastIndex - 1; i++) {
            if (inputArray[i] < inputArray[lastIndex]) {
                int tempJ = inputArray[lastIndex];
                inputArray[j] = inputArray[i];
                inputArray[i] = tempJ;
                j++;
            }

        }
        int tempJ = inputArray[j];
        inputArray[j] = inputArray[lastIndex];
        inputArray[lastIndex] = tempJ;
        quickSort(inputArray, 0, j + 1);
        quickSort(inputArray, j + 1, lastIndex);
    }
}
