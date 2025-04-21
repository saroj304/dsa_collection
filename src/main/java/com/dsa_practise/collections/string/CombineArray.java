package com.dsa_practise.collections.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CombineArray {

    public static void main(String[] args) {
        List<Integer> firstArray = new ArrayList<>();
        firstArray.add(1);
        firstArray.add(2);
        firstArray.add(3);
        firstArray.add(4);

        List<Integer> secondArray = new ArrayList<>();
        secondArray.add(3);
        secondArray.add(4);
        secondArray.add(5);
        secondArray.add(6);


       Set<Integer> thirdArray = new HashSet<>();

        firstArray.stream().map(data -> thirdArray.add(data))
                .collect(Collectors.toSet());

        secondArray.stream().map(data -> thirdArray.add(data))
                .collect(Collectors.toSet());

        System.out.println(thirdArray);

    }
}
