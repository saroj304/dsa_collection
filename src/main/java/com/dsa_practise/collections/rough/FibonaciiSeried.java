package com.dsa_practise.collections.rough;

public class FibonaciiSeried {
    static int start = 0;
    static int end = 1;
    static int result = start + end;

    public static void main(String[] args) {
        int number = 7;
        findFibonacii(number);

    }

    private static void findFibonacii(int number) {
        System.out.println(start);
        System.out.println(end);
        System.out.println(result);
        for (int i = 3; i <= number; i++) {
            start = end;
            end = result;
            result = start + end;
            System.out.println(result);
        }



    }
}
