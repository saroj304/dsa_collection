package com.dsa_practise.collections.string;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        String value = "sarojkhatiwada";
        String []splittedString=value.split("");
        String finalString="";
        for(int i=splittedString.length-1;i>=0;i--){
            finalString=finalString+splittedString[i];
        }
        System.out.println(finalString);
    }
}
