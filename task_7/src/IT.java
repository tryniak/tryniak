import sun.org.mozilla.javascript.internal.regexp.SubString;

import java.util.Scanner;

public class IT {
   static String str;
    public static void main(String[] args) {
        boolean b = true;
        str = "IT Academi";
        String str2 = str.substring( 0, 2);
        System.out.println( str2);
        Scanner sc = new Scanner(System.in);
        String a = "IT Academi";
        if (a.equals(str)){
        System.out.println("hh");}
        else System.out.println("nnn");
    }
}
