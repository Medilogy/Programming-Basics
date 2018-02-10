package fibonacci;

public class FibonacciRecurcively {
    public static void main(String[] args) {
        System.out.println("recurecively: " + fibRecurecively(9));
    }

    private static int fibRecurecively(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibRecurecively(num - 1) + fibRecurecively(num - 2);
    }

}
