package com.dsa_practise.collections.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student {
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student s1=new Student("ram",24);
        Student s2=new Student("sam",23);

        List<Student>students=new ArrayList<>();
        students.add(s1);
        students.add(s2);

        Collections.sort(students, new ComparatorTest());

        System.out.println(students);
    }
}
