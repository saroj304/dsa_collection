package com.dsa_practise.collections.rough;

import org.springframework.expression.spel.ast.OperatorPower;

import java.util.ArrayList;
import java.util.List;

public class ArmStrong {
    public static void main(String[] args) {
        int number = 53;
        double result = checkArmStrong(number);
        if (number == result) {
            System.out.println("the number is ArmStrong");

        } else {
            System.out.println("the number is not ArmStrong");
        }
    }

    private static double checkArmStrong(int quotient) {
        List<Integer> integer = new ArrayList<>();
        while (quotient != 0) {

            int remainder = quotient % 10;

            integer.add(remainder);

            quotient = quotient / 10;
        }
        double result = 0;
        for (int num : integer) {
            int powervalue = integer.size();
            result = result + Math.pow(num, powervalue);
        }

        return result;
    }
}
