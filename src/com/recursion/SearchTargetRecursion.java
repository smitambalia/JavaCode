package com.recursion;

import java.util.ArrayList;

public class SearchTargetRecursion {
    public static void main(String[] args) {
//        int[] arr = {1,3,9, 90,24,24,35};
        int[] arr = {5,6,7,8,9,1,2,3};
        int targetValue = 7;
        int s = 0, e = arr.length -1;
        int ans = searchTargetFromRotatedArray(arr,targetValue,s,e);
        System.out.println(ans);
//        boolean ans = searchTarget(arr,targetValue,0);
//        System.out.println(ans);
//        ArrayList<Integer> list = new ArrayList<>();

//        System.out.println(findAllIndex(arr,targetValue,0,list));
//        ArrayList list = findAll(arr,targetValue,0);
//        System.out.println(list);
    }

    static int searchTargetFromRotatedArray(int[] arr,int targetValue,int s, int e) {
        if(s > e) return  -1;
        int mid = s + (e - s) /2 ;
        if(arr[mid] == targetValue) return mid;
        if(arr[s] <= arr[mid]) {
            if(targetValue >= arr[s] && targetValue <= arr[mid]) {
                e = mid -1;
                return searchTargetFromRotatedArray(arr,targetValue,s,e);
            }
            else {
                s = mid +1;
                return searchTargetFromRotatedArray(arr,targetValue,s,e);
            }
        }
        if(targetValue > arr[mid] && targetValue <= arr[e]) {
            s = mid +1;
            return searchTargetFromRotatedArray(arr,targetValue,s,e);
        }
        else {
            e = mid - 1;
            return searchTargetFromRotatedArray(arr,targetValue,s,e);
        }

//        return arr[mid];
    }
    static  ArrayList<Integer> findAll(int[] arr,int targetValue,int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == index) return list;
        if(arr[index] == targetValue) list.add(index);
        ArrayList<Integer> ans = findAll(arr,targetValue,index +1);
        list.addAll(ans);
        return list;
    }
    static ArrayList findAllIndex(int[] arr, int targetValue, int i, ArrayList<Integer> list) {
        if(arr.length == i) return list;
        if(arr[i] == targetValue) list.add(i);
        return findAllIndex(arr,targetValue,i+1,list);

    }

    public static boolean searchTarget(int[] arr, int targetValue,int index) {
        if(arr.length == index) return false;
        return (arr[index] == targetValue) ?  true : searchTarget(arr,targetValue,index+1);
    }
}
