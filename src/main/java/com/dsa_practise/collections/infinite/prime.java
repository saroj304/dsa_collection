package com.dsa_practise.collections.infinite;

import java.util.Scanner;
import java.math.*;


public class prime {

    public static void main(String[] args) {

        System.out.printf("Enter  the number you want to check for the prime");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        double sqrt = Math.ceil(Math.sqrt(number));
        System.out.println(sqrt);

        for (int i = 2; i <= sqrt; i++) {

            if (number != i && number % i == 0) {
                System.out.printf("the number is a not a prime " + " " + number);
                return;
            }
        }

        System.out.printf("The number is a prime");

    }
}
