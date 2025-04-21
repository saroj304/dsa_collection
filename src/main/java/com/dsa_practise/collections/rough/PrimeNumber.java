package com.dsa_practise.collections.rough;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean resut = checkPrime(number);
        if (resut) {
            System.out.println(" Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }

    private static boolean checkPrime(int number) {
        if (number > 1) {
            for (int i = 2; i <= Math.sqrt(number); i++) {

                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
