package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check palindrom: ");
        int number = in.nextInt();
        int pal = number;
        int temp, palindrom=0;
        while(number > 0) {
            temp = number % 10;
            number /= 10;
            palindrom = palindrom*10 + temp;
        }

        if(number == pal) System.out.println(true);
        else System.out.println(pal);
    }
}
