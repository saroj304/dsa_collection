package com.dsa_practise.collections.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest implements Comparable<ComparableTest> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ComparableTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ComparableTest other) {


        return Integer.compare(this.age, other.age); // Sorting by age
    }

    public static void main(String[] args) {
        ComparableTest test = new ComparableTest("saroj", 24);
        ComparableTest test1 = new ComparableTest("ram", 23);

        List<ComparableTest> datas = new ArrayList<>();
        datas.add(test);
        datas.add(test1);

        // Sort list based on age (as defined in compareTo method)
        Collections.sort(datas);

        // Print sorted list
        for (ComparableTest data : datas) {
            System.out.println(data.getName() + ": " + data.getAge());
        }
    }
}
