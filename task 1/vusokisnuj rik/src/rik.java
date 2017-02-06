import java.util.Scanner;
public class rik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
         System.out.println("Input year");
        year = sc.nextInt();


        if ((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0))
         {System.out.println(" a leap");}
        else  System.out.println(" not a leap");
        /*year = year % 4 != 0 && year % 100 == 0 ? System.out.println("  a leap") : System.out.println(" not a leap"");*/
    }


    }
