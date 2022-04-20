package com.company;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,4},
                {23,5,8,10},
                {78,99,34,57},
                {12,18}
        };
        System.out.println(max(arr));
//        int target = 99;
//        int[] ans = search(arr,target);
//        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[] {i,j};
                }
            }

        }
        return new int[]{-1,-1};
    }
    static  int max(int[][] arr) {
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) max = arr[i][j];
            }

        }
        return max;
    }
}
