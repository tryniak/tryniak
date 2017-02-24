import java.util.Scanner;

/**
 * Created by Igor on 21.02.2017.
 */
 public class Name {

   static String  n, s, m, m1, n1;
    public void inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name");
         n = sc.next();
        System.out.println("Input surname");
        s = sc.next();
        System.out.println("Input middle name");
        m = sc.next();
    }

    public static void main(String[] args) {
        Name name = new Name();
        name.inputName();

        String m1 = m.toUpperCase();
        String n1 = n.toUpperCase();

        char a = n1.charAt(0);
        char b = m1.charAt(0);

        System.out.println();
        System.out.println( s.substring(0,1).toUpperCase() + s.substring(1,s.length())+ " " + a + ". " + b +".");
        System.out.println(n.substring(0,1).toUpperCase() + s.substring(1,s.length()) +" " + m.substring(0,1).toUpperCase() + s.substring(1,s.length()) +" " + s.substring(0,1).toUpperCase() + s.substring(1,s.length()));

    }
}

