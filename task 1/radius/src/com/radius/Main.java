package com.radius;


import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

   double pi, p, s, r;
    System.out.println("Input radius");
r = sc.nextInt();
        pi = 3.14;
        p = 2 * pi * r;
        s= pi * Math.pow (r,2);
System.out.println("Aria= "+s + "\nPerimeter= "+ p);
    }

}
