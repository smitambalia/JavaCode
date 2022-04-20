package com.company;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,10,14,50,66,73};
        int[] arr = {10,20,30,40,50};
        int target = 20;
        System.out.println(binarySearch(arr,target));
    }

//    10 20 30 40 50
//     e  s

    static  int binarySearch(int[] arr,int target) {
        int s = 0,e = arr.length -1;
        int mid = (int)(s +e) / 2;
        while (s <= e) {
            mid = s + (e- s) /2;
            System.out.println(mid);
            if(target > arr[mid]) s= mid +1;

            else if(target < arr[mid]) e = mid -1;

            else  return target;
        }
        return -1;
    }
    static  int agnosticBinarySearch(int[] arr,int target) {
        int s = 0,e = arr.length -1;
        int mid = (int)(s +e) / 2;
        if(arr[s] < arr[e]) {
            while (s <= e) {
                mid = s + (e- s) /2;
                if(target > arr[mid]) s= mid +1;

                else if(target < arr[mid]) e = mid -1;

                else  return target;
            }
            return -1;
        }
        else {
            while (s <= e) {
                mid = s + (e- s) /2;
                if(target > arr[mid]) e= mid - 1;

                else if(target < arr[mid]) s = mid + 1;

                else  return target;
            }
            return -1;

        }

    }

}
