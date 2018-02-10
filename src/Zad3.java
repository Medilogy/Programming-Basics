import jdk.nashorn.internal.ir.IfNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Zad3 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 2, 1, 6, 2};
        Integer[] arrError = {1, 2, 1, 6, 2};
        printArrayElements(arr);
        printArrayElements(arrError);
    }

    private static void printArrayElements(Integer[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer key = array[i];
            Integer count = map.get(key);
            if (count == null) {
                map.put(key, 1);
            } else {
                count++;
                map.replace(key, count);
            }
        }
        Integer mvp = 0;
        Integer maxCount = 0;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if ((Integer) pair.getValue() > maxCount) {
                maxCount = (Integer) pair.getValue();
                mvp = (Integer) pair.getKey();
            }

        }
        if (maxCount >= array.length / 2 + 1) {
            System.out.println(mvp);
        } else {
            System.out.println(-1);
        }
    }
}