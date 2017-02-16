import java.util.InputMismatchException;
import java.util.Scanner;

public class Rectangle {
    int a, b;

    static int squareRectangle(int a, int b) {
        int c = a * b;
        return c;
    }

    public static void main(String[] args) throws ArithmeticException {
int a = 0, b = 0;
        Rectangle rectangle = new Rectangle();

        System.out.println("Input");
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a < 0 || b < 0) throw new ArithmeticException("Your number is negative");
            if (a == 0 || b == 0) throw new ArithmeticException("Long rectangle can't be zero");
        } catch (InputMismatchException e) {
            System.out.println("You input incorrect type. You mast input a number.");
        }
        System.out.println(Rectangle.squareRectangle(a, b));




        }
    }


