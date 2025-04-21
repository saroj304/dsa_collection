package com.dsa_practise.collections.rough;

public interface Interface1 {
    default void print() {
        System.out.println("interface1");
    }
}

interface Interface2 {
    default void print() {
        System.out.println("interface2");
    }
}

class InterfaceTest implements Interface1, Interface2 {
    public static void main(String[] args) {
        InterfaceTest interfaceTest = new InterfaceTest();
        interfaceTest.print();
    }


    @Override
    public void print() {
        Interface1.super.print();
    }
}
