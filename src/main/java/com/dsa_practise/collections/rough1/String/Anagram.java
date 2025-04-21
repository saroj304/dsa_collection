package com.dsa_practise.collections.rough1.String;

import java.util.Arrays;
import java.util.Collections;

/**
 * write a program to check if 2 string are anaragram
 * eg:silent and listen are anaragram
 */
public class Anagram {
    public static void main(String[] args) {
        checkAnagram("silent", "listen");
    }

    private static void checkAnagram(String silent, String listen) {
        String[] firstWord = silent.replaceAll("\\s", "").split("");
        String[] secondWord = listen.replaceAll("\\s", "").split("");

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);


        String firstSortedData = Arrays.stream(firstWord).reduce("", (firstChar, secondChar) -> firstChar + secondChar);
        String secondSortedData = Arrays.stream(secondWord).reduce("", (firstChar, secondChar) -> firstChar + secondChar);
        System.out.println(firstSortedData);
        System.out.println(secondSortedData);

        if(firstSortedData.equals(secondSortedData)){
            System.out.println("2 word are anagram");
        }
         else{
            System.out.println("2 word are not anagram");
        }


    }

}
