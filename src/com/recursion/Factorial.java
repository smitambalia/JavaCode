package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    public  static int factorial(int num) {
        if(num == 1) return num;
        return num * factorial(num-1);
    }

}
