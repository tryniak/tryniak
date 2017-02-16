import java.util.InputMismatchException;
import java.util.Scanner;

public class AandB {
    double a;
    double b;

    public double div(double a, double b) {
        double c = a / b;
        System.out.println(" c = " + c);
        return c;
    }

    public static void main(String[] args) {
        AandB rectangle = new AandB();
        Scanner sc = new Scanner(System.in);

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (b == 0) throw new ArithmeticException();
            rectangle.div(a, b);
        } catch (InputMismatchException e) {
            System.out.println("You input incorrect type. You mast input a number.");

        }
    }
}