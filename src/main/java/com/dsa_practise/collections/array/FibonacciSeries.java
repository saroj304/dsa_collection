package com.dsa_practise.collections.array;

import java.io.PrintStream;
import java.util.Scanner;

//program to print first n fibonacii series
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number of digit you want to print !!");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a = 0;
        int b = 1;
        System.out.println("The fibonacci series is: ");
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print("  "+c);
        }
    }
}
