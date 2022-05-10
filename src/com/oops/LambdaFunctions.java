package com.oops;

import java.util.ArrayList;

public class LambdaFunctions {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            list.add(i+2);
        }
        list.forEach((item)-> {
            System.out.println(item * 4);
        });

        Operation sum = (a, b) -> a +b;
        LambdaFunctions fun = new LambdaFunctions();

        System.out.println(fun.operate(5,3,sum));

    }
    private int operate(int a, int b, Operation op) {
        return op.operation(a,b);
    }


}

interface Operation {
    int operation(int a,int b);
}
