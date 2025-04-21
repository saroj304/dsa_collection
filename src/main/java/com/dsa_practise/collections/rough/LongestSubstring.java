package com.dsa_practise.collections.rough;

import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        String value = "abcabcbb";
        findLongestSubstring(value);
    }

    private static void findLongestSubstring(String value) {


        List<Character> list = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < value.length(); i++) {
            if (list.contains(value.charAt(i))) {
                int j;
                String result = "";
                for (j = 0; j < list.size(); j++) {
                    result = result + list.get(j);
                }
                stringList.add(result);
                list.clear();

            }
            list.add(value.charAt(i));
        }
        Map<Integer, String> map = new HashMap<>();
        for (String str : stringList) {
            map.put(str.length(), str);
        }

        Set<Integer> keysetmap=  map.keySet();
        Collections.sort(keysetmap.stream().toList());

        String finalKey=map.get(keysetmap.size()-1);
        System.out.println(finalKey);



    }


}

