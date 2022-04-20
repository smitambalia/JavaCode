package com.company;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {10,4,80},
                {20,52,3},
                {9,1,93}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            int sumWealth = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sumWealth += accounts[person][account];
            }
            if(sumWealth > max) max = sumWealth;
        }
        return max;
    }
}
