package com.dsa_practise.collections.array.binarysearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {

        char[] arrays = {'c', 'f','j'};
        char output = nextGreatestLetter(arrays, 'd');
        System.out.println(output);
    }

    public static char nextGreatestLetter(char[] letters, char target) {

        int startIndex = 0;
        int endIndex = letters.length-1;
        while (startIndex <= endIndex) {
            int mid;
            mid = startIndex+((endIndex-startIndex)/2);


            if (target > letters[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return letters[startIndex%letters.length];
    }
}
