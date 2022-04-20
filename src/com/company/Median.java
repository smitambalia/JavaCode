package com.company;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] nums1 ={1,1};
        int[] nums2 = {1,3,4};
        int[] nums3 = new int[nums1.length + nums2.length];
        int i=0,j=0, l =0;
        while (i < nums1.length && j < nums2.length) {

            if(nums1[i] < nums2[j]) {
                nums3[l] = nums1[i];
                l++;
                i++;
            }
            else {
                nums3[l] = nums2[j];
                j++;
                l++;
            }
        }
        System.out.println(j);
        while(i< nums1.length) {
            nums3[l] = nums1[i];
            i++;
            l++;
        }
        while ( j < nums2.length) {
            System.out.println("Prev "+j);
            nums3[l] = nums2[j];
            j++;
            l++;
            System.out.println("after "+j);
        }

        double result= 0;


        if(nums3.length % 2 ==1) {
            int mid = (nums3.length -1) /2;
            result = nums3[mid];
        }
        else if(nums3.length %2 ==0) {
            int mid = (nums3.length -1)/2;

            result=   (nums3[mid] + (double)nums3[mid+1] ) /  2;
        }

        System.out.println(Arrays.toString(nums3));
        System.out.println(result);

    }
}
