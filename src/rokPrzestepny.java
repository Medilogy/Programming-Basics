public class rokPrzestepny {
    public static void main(String[] args) {
        System.out.println(calc(3));
        System.out.println(calc(2000));
        System.out.println(calc(2005));
        System.out.println(calc(2009));

    }
    private static String calc(int num) {
        return num % 4 == 0 && num % 100 !=0 || num % 400 == 0 ? "Tak" : "Nie";
    }
}
