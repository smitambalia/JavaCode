package com.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int num = fibbed(10);
        System.out.println(num);
    }
      static int fibbed(int num) {
        if(num  < 2) return num;
        return  fibbed(num -1) + fibbed(num -2);

    }
}
