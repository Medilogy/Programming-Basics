package pl.sda.poznan.math.math;

/**
 * Klasa pomocnicza do obliczen matematycznych
 * @author xmedi
 * @since 1.0
 */

public class MathHelper {
    private MathHelper() {
        throw new UnsupportedOperationException("Helper class");
    }

    /**
     * Metoda obliczajaca n!
     * @param n - liczba z ktorej chcesz policzyc silnie
     * @return - zwracany wynik
     */

    public static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

