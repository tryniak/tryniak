import java.util.InputMismatchException;
import java.util.Scanner;

public class AandB {
    double a;
    double b;

    public double div(double a, double b) throws ArithmeticException {

        if (b == 0) throw new ArithmeticException();
        return a / b;
    }

    public static void main(String[] args) {
        AandB aandB = new AandB();

        try {

            System.out.println(aandB.div(5, 7));
        } catch (InputMismatchException e) {
            System.out.println("You input incorrect type. You mast input a number.");

        }
catch (ArithmeticException e) {
    System.out.println("sfs");
}
    }

}