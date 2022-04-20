package com.company;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {23,4,10,7,3,9};
        System.out.println(findMin(arr));
     }
     static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
             if (min > arr[i]) {
                 min = arr[i];
             }
         }
        return min;
     }

}
