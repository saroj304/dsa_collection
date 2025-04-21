package com.dsa_practise.collections.array;

public class PrimeTest {
    public static void main(String[] args) {
        int n = 105;
        var number = n-1;
        var flag = 0;
        while (number > 1) {

            if (n % number == 0) {
                flag++;
                break;
            }
            number--;

        }
        if (flag != 0) {
            System.out.println("the number is not a prime number");
            return;
        }
        System.out.println("the number is a prime number");

    }
}
