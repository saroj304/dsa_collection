package com.dsa_practise.collections.infinite;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.printf("Enter the number you want to check");
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int target=number;
        int data = number;
        List<Integer> digitsInNumber = new ArrayList<>();
        while (number != 0) {
            data = number % 10;
            digitsInNumber.add(data);
            number = number / 10;
        }
        List<Integer> sumOfDigit = new ArrayList<>();
        int sum = 0;
        int lengthOfdigit = digitsInNumber.size();
        for (int i = 0; i < lengthOfdigit; i++) {
            int value = digitsInNumber.get(i);
            int powervalue = (int) Math.pow(value, lengthOfdigit);
            sum = sum + powervalue;

        }
       if(sum==target){
           System.out.print("the number"+" "+target+" "+"is a prime number");
       }
    }
}
