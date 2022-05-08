package com.oops;

import java.util.Arrays;

public class CustomArrayList {
    private  int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data  = new int[DEFAULT_SIZE];
    }
    public  void add(int val) {
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

    public  int remove() {
        int removed = data[size--];
        return removed;
    }
    public  int get(int index) {
        return  data[index];
    }
    public void set(int index , int val) {
        data[index] = val;
    }
    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(50);
        list.add(10);
        System.out.println(list);

    }

}
