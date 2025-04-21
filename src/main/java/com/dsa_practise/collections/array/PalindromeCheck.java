package com.dsa_practise.collections.array;

public class PalindromeCheck {
    public static void main(String[] args) {
        String palidromeString = "leve";
        var parssedString = palidromeString.toLowerCase();
        var firstIndex = 0;
        var lastIndex = parssedString.length() - 1;
        var flag = 0;
        while (firstIndex <= lastIndex) {
            if (parssedString.charAt(firstIndex) != parssedString.charAt(lastIndex)) {
                flag = flag + 1;
                break;
            }
            firstIndex++;
            lastIndex--;
        }
        if (flag == 1) {
            System.out.println("the given string" + parssedString + " is not  a palindrome");
            return;
        }
        System.out.println("the given string" + parssedString + " is a palindrome");
    }
}
