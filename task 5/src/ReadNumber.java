import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadNumber {
    int start, end;
    public int numbers(int start, int end) {

        try {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (start > a || a > end)
                throw new ArithmeticException("Inputed value must be between " + start + " and " + end);
            return a;
        }
        catch (InputMismatchException e) {
            throw new InputMismatchException("Inputed value is not number type.");
        }
    }
    public static void main(String[] args){
        ReadNumber read = new ReadNumber();
        read.numbers(2, 45);
    }
}


