package mergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] inputArr = {6, 5, 4, 1, 3, 7, 9, 2};
        mergeSort(inputArr, 0, inputArr.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int leftLenght = middle - left + 1;
        int rightLenght = right - middle;
        int[] leftArr = new int[leftLenght];
        int[] rightArr = new int[rightLenght];
        int[] resultArr = new int[leftLenght+rightLenght];
        for (int i = left; i < middle + 1; i++) {
            leftArr[i - left] = array[i];

        }
        for (int i = middle + 1; i < right + 1; i++) {
            rightArr[i - middle - 1] = array[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftLenght && j < rightLenght){
            if (leftArr[i] < rightArr[j]){
                resultArr[k] = leftArr[i];
                k++;
                i++;
            }else {
                resultArr[k] = rightArr[j];
                k++;
                j++;
            }
        }
        while (i < leftLenght) {
            resultArr[k] = leftArr[i];
            k++;
            i++;
        }
        while (j < rightLenght) {
            resultArr[k] = rightArr[j];
            k++;
            j++;
        }
        for (i = 0; i < resultArr.length; i++) {
            array[left + i] = resultArr[i];

        }
    }
}
