package com.dsa_practise.collections.string;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String word = "madams ";
        System.out.println( checkPalindrome(word));
    }

    public static boolean checkPalindrome(String word) {
        // Removing special characters and spaces
        String result = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int startIndex=0;
        int endIndex=result.length()-1;

        while(startIndex<=endIndex){

            if(result.charAt(startIndex)!=result.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;



        

       /* for (int i = 0; i < result.length(); i++) {
            int j = result.length() - i - 1;

           if(result.charAt(i) != result.charAt(j)) {
               return false;
           }
           if(i==j){
               break;
           }
        }
        return true;
        */

    }
}