package com.name;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
        String adress;
        Scanner sc= new Scanner(System.in);
        System.out.println("What is you name?");
        String name =br.readLine();
        System.out.println("How old are you?");
    int age = Integer.parseInt(br.readLine());
        System.out.println("where do you live "+  name+"?");
adress=sc.nextLine();
        System.out.println("You name is "+ name+ "\nYou are " + age+ "\nYou live in "+ adress );
    }
}
