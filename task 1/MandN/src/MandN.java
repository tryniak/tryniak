
import java.util.Scanner;
public class MandN {
    public static void main(String[] args) {
        int m, n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input m");
        m = sc.nextInt();
        if (m < 0)
        {n = -1;}

        else if (m > 0)
        {n = 1;}

        else if (m == 1)
        {n = 1;}

        System.out.println("n = " + n);
    }
}
