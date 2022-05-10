package com.oops;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericArrayList<T> {
    private  Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data  = new Object[DEFAULT_SIZE];
    }
    public  void add(T val) {
        if(isFull()) {
            resize();
        }
        data[size++] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public  T remove() {
        T removed = (T)(data[size--]);
        return removed;
    }
    public  T get(int index) {
        return  (T)(data[index]);
    }
    public void set(int index , int val) {
        data[index] = val;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for (int i = 0; i < 14 ; i++) {
            list.add( 2* i);
        }
        System.out.println(list);

    }

}
