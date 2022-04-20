package com.company;

import java.util.Arrays;

public class InfinityArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9,  10, 12, 13, 15, 16, 17, 19, 21, 25, 27, 29, 31, 34};
        int answer = ans(arr, 19);
        System.out.println(answer);

    }


    static  int ans(int[] arr, int target) {
        int cont = 2,s=0,end=1;
        while(target>arr[end]) {
            int temp = end +1 ;
            end = end + (end-s +1) *2;
            s = temp;
        }
        return  binarySearch(arr,target,s,end);
    }
    static int binarySearch(int[] arr,int target,int s ,int e) {

        while (s <= e) {
            int mid = s + (e- s) /2;
            if(target > arr[mid]) s= mid +1;

            else if(target < arr[mid]) e = mid -1;

            else  return mid;
        }
        return -1;
    }

}
