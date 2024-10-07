package com.dsa_practise.collections.linear_search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberWithEvenDigitsInAnArray {
    public static void main(String[] args) {
        int[] arr = {555,901,482,1771};
        System.out.println(findNumberWithEvenDigitsInAnArray(arr));
    }

    private static int findNumberWithEvenDigitsInAnArray(int[] arr) {
        List<Integer> numberWithEvenDigits = new ArrayList<>();
        if (arr == null) {
            return 0;
        }
        for (int num : arr) {
            int result = findEvenNumberDigit(num);
            if (result != -1) {
                numberWithEvenDigits.add(result);
            }
        }
        return numberWithEvenDigits.size();
    }

    private static int findEvenNumberDigit(int num) {
        String stringValueOfANumber = Integer.toString(num);
        var splittedString = stringValueOfANumber.split("");
        var count = splittedString.length;
        if (count % 2 == 0) {
            return num;
        }
        return -1;
    }
}
