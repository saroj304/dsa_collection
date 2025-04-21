/*
package com.dsa_practise.collections.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparatorTest {
    private final int age;
    private final String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    ComparableAndComparatorTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComparableAndComparatorTest{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args) {
        ComparableAndComparatorTest test = new ComparableAndComparatorTest(11,"ram");
        ComparableAndComparatorTest test2 = new ComparableAndComparatorTest(22,"rahul");
        ComparableAndComparatorTest test3 = new ComparableAndComparatorTest(10,"roshan");
        List<ComparableAndComparatorTest>listOfData=new ArrayList<ComparableAndComparatorTest>();
        listOfData.add(test);
        listOfData.add(test2);
        listOfData.add(test3);
        Collections.sort(listOfData,new ComparatorTest());
        System.out.println(listOfData);
    }
}
*/
