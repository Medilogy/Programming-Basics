package BinaryDigit;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        decimal2Binary(num);

    }
    private static void decimal2Binary(int num) {
        Stack stack = new Stack();
        while (num > 0) {
            stack.push(num % 2);
            num = num /2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
