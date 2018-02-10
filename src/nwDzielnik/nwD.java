package nwDzielnik;

public class nwD {
    public static void main(String[] args) {
        nwd(174, 18);
        nww(192, 348);
    }

    public static int nwd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
        return a;
    }

    public static void nww(int a, int b) {
        System.out.println(a * 2 / nwd(a, b));
    }
}