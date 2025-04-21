package com.dsa_practise.collections.rough1.String;

import org.eclipse.osgi.internal.serviceregistry.ServiceUse;

import java.util.*;
import java.util.concurrent.Flow;
import java.util.stream.Collectors;

public class Palindrome {
    static String checkPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;
        var loweCaseWord = word.toLowerCase();
        while (start < end) {
            if (!(loweCaseWord.charAt(start) == loweCaseWord.charAt(end))) {
                return "";
            }
            start++;
            end--;
        }
        return word;
    }

    private static List<String> createSubstring(String word) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            List<String> substringAsPerIndexi = new ArrayList<>();
            char charPerIndex = word.charAt(i);
            substringAsPerIndexi.add(String.valueOf(word.charAt(i)));
            String data = "";
            data += data + charPerIndex;
            for (int j = i + 1; j < word.length(); j++) {

                data += word.charAt(j);
                substringAsPerIndexi.add(data);

            }
            substringAsPerIndexi.stream().forEach(substring -> substrings.add(substring));
        }
        return substrings;
    }

    private static List<String> passSubstringtoPalindromeChecker(List<String> substrings) {
        List<String> palindromicSubstrings = substrings.stream().map(substring -> checkPalindrome(substring))
                .filter(substring -> !substring.equals("")).collect(Collectors.toList());
        return palindromicSubstrings;
    }

    public static void main(String[] args) {

        List<String> palindromicSubstrings = new ArrayList<>();
        //split the substrings
        String word = "cbbd";
        List<String> substringswithEmptyString = createSubstring(word);
        List<String> substrings = passSubstringtoPalindromeChecker(substringswithEmptyString);

        Map<Integer, String> mapList = new HashMap<>();
        substrings.stream().forEach(palindromicSubstring -> {
            mapList.put(palindromicSubstring.length(), palindromicSubstring);
        });
       /*OptionalInt maxvalue=mapList.keySet().stream().mapToInt(Integer::intValue)
                .max();*/

        Optional<Integer> max = mapList.keySet().stream().findFirst();
        Integer maxValue = max.get();
        List<Integer> integerList = mapList.keySet().stream().collect(Collectors.toList());
        for (int i = 0; i < mapList.keySet().size(); i++) {
            if (integerList.get(i) > max.get()) {
                maxValue = integerList.get(i);
            }
        }
        System.out.println(maxValue);
    }


}
