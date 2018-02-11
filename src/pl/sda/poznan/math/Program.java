package pl.sda.poznan.math;

import pl.sda.poznan.math.math.MathHelper;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę większą od zera: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = MathHelper.factorial(number);
//        System.out.println("Dla " + number + "! wynik to " + result);

        System.out.println(String.format("Dla %s! wynik to: %d", number, result));
    }
}
