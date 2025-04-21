package com.dsa_practise.collections.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//program to combine both the list and display in one list
public class InnerListString {


    public static void main(String args[]) {
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("saroj", "ram"),
                Arrays.asList("Hari", "Gopal"),
                Arrays.asList("MADAN", "KRISHNA")
        );


        List<String> values = lists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());
        System.out.println(values);
    }
}
