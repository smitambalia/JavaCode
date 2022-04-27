package com.recursion.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,4,57,12,9,112};
        int targetValue = 57;
        int findValue = search(arr,targetValue,0,arr.length -1);
        System.out.println(findValue);
    }
    public  static  int search(int[] arr,int targetValue,int s, int e) {
        if(s > e) return -1;
        int mid = s + (e -s) /2;
        if(arr[mid] == targetValue) {
            return mid;
        }
        if(targetValue < arr[mid]) {
            return search(arr,targetValue,s,mid-1);
        }

        return search(arr,targetValue,mid+1,e);
    }
}
