package com.AandB;

import java.util.Scanner;
public class AandB {
    public static void main(String[]args){
        double a, b;
        Scanner sc = new Scanner(System.in);
        Scanner bc = new Scanner(System.in);
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("input b");
        b = bc.nextInt();
        System.out.println("a + b = " + (a+b)+"\na -  b = "+ (a- b) + "\na * b = " + (a*b) +   "\na / b = " + (a / b));

    }
}
