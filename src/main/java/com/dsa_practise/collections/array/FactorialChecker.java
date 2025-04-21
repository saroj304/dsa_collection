package com.dsa_practise.collections.array;

public class FactorialChecker {
    public static void main(String[] args) {
        var targetNumber=5;
        var flag=targetNumber;
        while (targetNumber > 0) {


            targetNumber--;
            if(targetNumber==0){
                break;
            }
            flag=flag*targetNumber;
        }
        System.out.println(flag);
    }
}
