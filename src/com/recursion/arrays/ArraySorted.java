package com.recursion.arrays;

public class ArraySorted {
    public static void main(String[] args) {
        int[] num = {1,9,10,1,12};
        boolean status = sortedArrays(num,0);
        System.out.println(status);
    }

    static  boolean sortedArrays(int[] nums,int index) {
        if(index == nums.length -1) return true;
        return nums[index] < nums[index +1] && sortedArrays(nums, index +1);
    }
}
