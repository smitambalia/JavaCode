package com.company;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1};
        int peak = findPeak(arr);
        System.out.println(peak);
    }
    static  int findPeak(int[] arr) {
        int start =0, end = arr.length-1,mid;
        while(start < end) {
            mid = start + (end -start) /2;
            if(arr[mid] < arr[mid+1]) start = mid +1;
            else end = mid;
        }
        return start;
    }
}
