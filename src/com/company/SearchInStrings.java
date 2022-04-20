package com.company;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Smit";
        char target = 'm';
//        boolean ans = search1(name,target);
//        if(ans) {
//            System.out.println(target+" is found in "+ name);
//        }
//        else {
//            System.out.println("Not found");
//        }
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean search1(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (char c: str.toCharArray()) {
            if(c== target) {
                return  true;
            }
        }
        return false;
    }
    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== target) {
                return true;
            }
        }
        return false;
    }
}
