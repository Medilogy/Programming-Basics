package banknoty;

public class Banknoty {

    public static final int[] ZLOTY = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static final int[] GROSZE = {50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        calc(1764.54);
    }

    private static void calc(double num) {
        int grosze = (int) (num * 100 - Math.floor(num) * 100);
        int zloty = (int) ((num * 100 - grosze) / 100);
        int iter = 0;

        while (zloty > 0) {
            int bankNoteCount = Math.floorDiv(zloty, ZLOTY[iter]);
            zloty = zloty - bankNoteCount * ZLOTY[iter];
            if (bankNoteCount != 0) {
                System.out.println(bankNoteCount + " x " + ZLOTY[iter] + " zl");
            }
            iter++;
        }
        iter = 0;
        while (grosze > 0) {
            int bankNoteCount = Math.floorDiv(grosze, GROSZE[iter]);
            grosze = grosze - bankNoteCount * GROSZE[iter];
            if (bankNoteCount != 0) {
                System.out.println(bankNoteCount + " x " + GROSZE[iter] + " gr");
            }
            iter++;
        }
    }
}