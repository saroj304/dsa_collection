package com.dsa_practise.collections.linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumIn2D {
    public static void main(String[] args) {
        int[][] arr =
                {
                        {2, 3, 4, 5},
                        {5, 6, 9, 12},
                        {8, 1, 15, 13}
                };

        System.out.println(maxNumIn2D(arr));
    }

    private static int maxNumIn2D(int[][] arr) {
        if(arr.length==0){
            return -1;
        }
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return  max;
    }
}
