package com.recursion.binarysearch;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1346;
        int finalData = sumOfDigits(num);
        System.out.println(finalData);

    }
    static int sumOfDigits(int num) {
        if(num ==0 ) return num;
        return  (num % 10)  + sumOfDigits(num /10);
    }
}
