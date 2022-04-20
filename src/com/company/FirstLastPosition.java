package com.company;

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int  arr[] = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }
    static  int[]  searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        ans[1] = search(nums,target,false);
        return  ans;

    }
    static  int search(int[] nums, int target, boolean searchStartIndex) {
        int start = 0, end = nums.length -1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end -start) / 2;
            if(nums[mid] > target) end = mid -1;
            else if (nums[mid] < target)  start = mid +1;
            else {
                ans = mid;
                if(searchStartIndex == true) {
                    end = mid  - 1;
                }
                else  start = mid + 1;
            }
        }
        return ans;
    }

}
