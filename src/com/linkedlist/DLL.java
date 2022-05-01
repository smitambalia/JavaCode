package com.linkedlist;

public class DLL {
    Node head;
    int size = 0;
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
        size++;
    }
    public  void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev =temp;
        temp = node;
        temp.next = null;
    }
    public void  insert(int val, int value) {
        Node node = new Node(value);
        Node temp = find(val);
        if(temp == null) return;
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(temp.next != null)  temp.next.prev = node;
    }
    public Node find(int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.val == val) return temp;
            temp = temp.next;
        }
        return null;
    }
    public void display() {
        Node temp = head;
        Node last  = null;
        while (temp != null) {
            System.out.print(temp.val +"-->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while(last != null) {
            System.out.print(last.val + "-->");
            last = last.prev;
        }
        System.out.println("END");
    }



    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int val) {
            this.val = val;
        }
    }

}