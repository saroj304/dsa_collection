package com.dsa_practise.collections.rough;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurenceCount {
    public static void main(String[] args) {
        String value = "madam";

        System.out.println(countCharacter(value));
    }

    private static Map countCharacter(String value) {
        Map<Character, Integer> map = new HashMap<>();
        int numberOfOccurences = 0;
        for (int i = 0; i < value.length(); i++) {
            if (!map.containsKey(value.charAt(i))) {
                map.put(value.charAt(i), numberOfOccurences);
            }
            numberOfOccurences = map.get(value.charAt(i)) + 1;
            map.put(value.charAt(i), numberOfOccurences);
            numberOfOccurences = 0;
        }
        return map;
    }
}
