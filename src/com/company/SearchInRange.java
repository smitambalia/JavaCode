package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,10,-1,3};
        int target = 5;
        System.out.println(searchRange(arr,target,1,5));

    }
    static int searchRange(int[] arr, int target, int  start, int end) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
