package com.company;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1};
        int target = 4 ;
        int peak = search(arr,target);
        System.out.println(peak);
    }
    static int search(int[] arr,int target) {
        int findPeak = findPeak(arr);
        int firstTry = agnosticBinarySearch(arr,target,0,findPeak);
        if(firstTry != -1) {
            return firstTry;
        }
        return  agnosticBinarySearch(arr,target,findPeak+1, arr.length-1);
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

    static  int agnosticBinarySearch(int[] arr,int target,int s, int e) {
//        int s = 0,e = arr.length -1;
        int mid = s + (e-s) / 2;
        if(arr[s] < arr[e]) {
            while (s <= e) {
                mid = s + (e- s) /2;
                if(target > arr[mid]) s= mid +1;

                else if(target < arr[mid]) e = mid -1;

                else  return mid;
            }
            return -1;
        }
        else {
            while (s <= e) {
                mid = s + (e- s) /2;
                if(target > arr[mid]) e= mid - 1;

                else if(target < arr[mid]) s = mid + 1;

                else  return mid;
            }
            return -1;

        }

    }
}
