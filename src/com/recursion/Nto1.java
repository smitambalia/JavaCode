package com.recursion;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
//        print(n);
        printRev(n);
    }

    private static void printRev(int n) {
        if(n == 0) return;
        printRev(n-1);
        System.out.println(n);

    }

    static void print(int n) {
        if(n == 0) return;
        System.out.println(n);
        print(n-1);
    }
}
