package com.dsa_practise.collections.linear_search;

import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {

        int[][] arr =
                {
                        {2, 3, 4, 5},
                        {5, 6, 9, 12},
                        {8, 1, 15, 13}
                };
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target number");
        int target = s.nextInt();
        System.out.println(searchIn2D(target, arr));

    }

    private static int[] searchIn2D(int target, int[][] arr) {
        if (arr.length == 0) {
            System.out.println("Nothing found");
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target) {
                    return new int[]{row, column};
                }
            }
        }
        System.out.println("Target not found");
        return new int[]{-1, -1};
    }
}
