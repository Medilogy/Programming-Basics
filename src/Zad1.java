import java.util.Scanner;
import java.util.stream.IntStream;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(",");

        printArrElements(split);

    }

    private static void printArrElements(String[] array) {
        IntStream.range(0, array.length).filter(value -> value % 2 == 0).mapToObj(operand -> array[operand]).forEach(System.out::println);
//        for (int i = 0; i < array.length; i += 2) {
//            if (i % 2 == 0) {
//                System.out.println(array[i]);
    }

}
//  }
//}
