package factorialSilnia;//silnie rekurencyjnie

public class FactorialRecurent {
    public static void main(String[] args) {

        System.out.println("recurcively " + computeFactorialRecursively(5));
    }

    private static int computeFactorialRecursively(int num) {
        if (num == 1) {
            return 1;
        }
        return num * computeFactorialRecursively(num - 1);
    }
}
