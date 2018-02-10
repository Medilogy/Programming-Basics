package factorialSilnia;

public class Factorial {
    public static void main (String[] args) {
        System.out.println(computeFactorial(5));
    }
    private static int computeFactorial(int num) {
        int product = 1;
        for (int j = 1; j <= num; j++){
            product = product * j;
        }
        return product;
    }
}
