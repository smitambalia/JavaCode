package com.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private  int size;

    public LL() {
        this.size = 0;
    }
    public void  insert(int value , int index) {
        if(index ==0) {
            insertFirst(value);
            return;
        }
        if(index ==size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index -1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size +=1;

    }
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail ==null) tail = head;
        size +=1;
    }
    public void insertLast(int value) {
        Node node = new Node(value);
        if(tail == null) {
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size +=1;
    }
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return  temp;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size -2);
        int val  = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size) return  deleteLast();
        Node temp = get(index -1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;

    }
    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if(temp.value == value) return temp;
            temp = temp.next;
        }
        return null;
    }
    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head ==null) tail = null;
        size --;
        return val;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+ "-->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private  class Node {
        private  int value ;
        private  Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {

    }
}
