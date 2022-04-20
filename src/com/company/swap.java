package com.company;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = { 1 , 3 ,23 ,9, 18, 10};
//        swap(arr, 1 ,3 );
        swapArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void  swap (int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static void swapArr(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            swap(arr,start,end);
            start = start + 1;
            end = end - 1;
        }

    }
}
