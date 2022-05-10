package com.oops.comparing;

public class Main {
    public static void main(String[] args) {
        Student smit = new Student(2,99.93f);
        Student nehal = new Student(1,98.83f);

        if(smit.compareTo(nehal) > 0) System.out.println("Smit's marks are greater then Nehal");
        else System.out.println("Nehal's marks are greater then Smit:");

    }
}
