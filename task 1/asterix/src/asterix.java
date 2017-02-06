
public class asterix {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println();
                continue;
            }
            for (int j = 2; j > (i / 2); j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
        }
    }
}



