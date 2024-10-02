package com.dsa_practise.collections.linear_search;

import java.util.Scanner;

public class linearSearch {


    public static void main(String[] args) {
        int[] datas = {3, 5, 7, 11, 33, 99};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the target you want to search");
        int target = s.nextInt();
        System.out.println(findTarget(target, datas));
    }

    private static int findTarget(int target, int[] datas) {

        if (datas.length == 0) {
            System.out.println("Nothing found");
            return -1;
        }

        for (int i = 0; i < datas.length; i++) {
            if (target == datas[i]) {

                System.out.println("target it found!!");
                return target;
            }
        }
        System.out.println("Nothing found");
        return -1;

    }
}
