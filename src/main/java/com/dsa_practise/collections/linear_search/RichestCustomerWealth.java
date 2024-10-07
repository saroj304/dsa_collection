package com.dsa_practise.collections.linear_search;

import java.util.ArrayList;
import java.util.List;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(calculateWealth(arr));
    }

    private static int calculateWealth(int[][] arr) {
        if (arr.length == 0) {
            return -1;
        }
        List<Integer> totalWealthsOfAllCustomers = new ArrayList<>();

        for (int[] ints : arr) {
            int totalWealthOfAPerson = 0;
            for (int bankAccount = 0; bankAccount < ints.length; bankAccount++) {
                totalWealthOfAPerson += ints[bankAccount];
            }
            totalWealthsOfAllCustomers.add(totalWealthOfAPerson);

        }

        int maxWealth = totalWealthsOfAllCustomers.getFirst();

        for (int wealth : totalWealthsOfAllCustomers) {
            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }
}
