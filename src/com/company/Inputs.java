package com.company;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the roll number: ");
        int rollno = input.nextInt();
        int count = 0;
        System.out.println(Math.log10(rollno) );
        while (rollno != 0) {
            rollno = rollno / 10;
            count +=1;
        }
        System.out.println(count);
//        System.out.println("Your roll number is "+ rollno);
//        int a = 230_000_00;
//        System.out.println(a);

//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = input.next();
//        }
//        System.out.println(Arrays.toString(str));
    }
}
