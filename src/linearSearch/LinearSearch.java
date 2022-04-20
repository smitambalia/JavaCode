package linearSearch;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>(5);
        int[] nums = {1,2,3,4,10};
        int target  = 101;
        boolean ans = linearSearch(nums, target) ;
        if(ans) {
            System.out.println(target + " is found");
        }
        else System.out.println("Not Found in the array");

    }
//    search in the array : return index if item found
//    otherwise return -1
    static boolean linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
