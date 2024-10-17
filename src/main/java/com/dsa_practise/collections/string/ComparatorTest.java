package com.dsa_practise.collections.string;

public class ComparatorTest implements java.util.Comparator<ComparableAndComparatorTest> {

    @Override
    public int compare(ComparableAndComparatorTest o1, ComparableAndComparatorTest o2) {
       return o1.getAge()> o2.getAge()?1:-1;
    }
}
