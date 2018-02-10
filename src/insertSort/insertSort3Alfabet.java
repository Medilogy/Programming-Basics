package insertSort;

public class insertSort3Alfabet {
    public static void main(String[] args) {
//        Integer[] inputArray = {7, 3, 4, 8, 5, 9};
//        sort(inputArray);
        String[] imputArray = {"ca", "cd", "cb", "a", "cba", "cda", "acd"};
        insertSortString(imputArray, true);
    }

    private static void insertSortString(String[] array, boolean orderAsc) {
        Integer pointer = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < pointer; j++) {
                char[] arrayJ = array[j].toCharArray();
                char[] arrayP = array[pointer].toCharArray();
                for (int k = 0; k < arrayJ.length && k < arrayP.length; k++) {
                    if (arrayJ[k] > arrayP[k] && orderAsc) {
                        swapString(array, pointer, j);

                        //String temp = array[pointer];
                        //array[pointer] = array[j];
                        //array[j] = temp;
                        break;
                    } else if (arrayJ[k] == arrayP[k] && arrayJ.length != arrayP.length) {
                        if (arrayJ.length == k + 1) {
                            swapString(array, j, pointer);
                        }
                    }
                }
            }
            if (pointer < array.length - 1) {
                pointer++;
            }
        }
    }

    private static void swapString(String[] array, int j, Integer pointer) {
//        System.out.println("arr " + pointer + " " + array{pointer) + <= ;
//        String temp = array[pointer];
//        array[pointer] = array[j];
//        array[j] = temp;
    }


    public static void insertSort(Integer[] array, boolean orderAsc) {
        Integer pointer = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < pointer; j++) {

            }

        }
    }
}
// cos niedziala

