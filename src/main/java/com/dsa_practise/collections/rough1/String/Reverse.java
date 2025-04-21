package com.dsa_practise.collections.rough1.String;

public class Reverse {
    public static void main(String[] args) {
        String name="saroj";
        String reverseName="";
        int count=name.length()-1;
        while(count>=0){
            System.out.println(name.charAt(count));
            reverseName+=name.charAt(count);
            count--;
        }
        System.out.println(reverseName);
    }
}
