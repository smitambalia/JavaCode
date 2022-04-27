package com.recursion;

public class CountOfZero {
    public static void main(String[] args) {
        int num = 30200;
        int finalValue = countOF(num);
        System.out.println(finalValue);
    }
    public static  int countOF(int num) {
        return  helper(num,0);

    }
    static int helper(int num,int cnt) {
        if(num ==0 ) return  cnt;
        int rem = num % 10;
        if(rem == 0) return helper(num/10,cnt+1);
        else return  helper(num/10,cnt);


    }
}
