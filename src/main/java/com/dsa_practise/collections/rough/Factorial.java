package com.dsa_practise.collections.rough;

public class Factorial {
    public static void main(String[] args) {
        int number=5;
       int result= findFactorial(number);
        System.out.println(result);
    }

    private static int findFactorial(int number) {
        int result=number;
        for(int i=number-1;i>0;i--){
            result=result*i;
        }
        return result;
    }
}
