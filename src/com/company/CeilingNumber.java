package com.company;

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,14,16,18};
        int target= 20;
        System.out.println(findCeilingNumber(arr,target));
    }
    static int findCeilingNumber(int[] arr,int target) {
        int s = 0, e = arr.length -1, mid;
        if(target > arr[arr.length -1]) return -1;
        if(arr[s] < arr[e]) {

            while (s <= e) {
                mid = s + (e-s) /2;
                if(target > arr[mid]) s = mid +1;
                else if(target < arr[mid]) e = mid -1;
                else return target;
            }
        }
        return arr[s];
    }
}
