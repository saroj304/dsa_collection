package com.dsa_practise.collections.infinite;

import java.util.Scanner;

public class fibonacii {
//    eg:0,1,1,2,3,5,8 etc

    public static void main(String[] args) {
        int a =0;
        int b=1;
        System.out.printf("Enter how much you want");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=0;
        System.out.printf(a+" "+b);;
        while(i<n){
            int c;
            c=a+b;
            System.out.printf(String.valueOf(c));
            a=b;
            b=c;
i++;
        }
    }




}
