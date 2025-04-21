package com.dsa_practise.collections.rough;

import java.util.*;

public class RemoveDuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(
                Arrays.asList(2, 3, 4, 2, 4, 3, 1, 5, 4)
        );
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int numberOfDuplicates = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), numberOfDuplicates);
            }
            numberOfDuplicates=map.get(list.get(i))+1;
            map.put(list.get(i), numberOfDuplicates);
            numberOfDuplicates=0;
        }
        System.out.println(map);

        System.out.println(map.keySet());

    }
}
