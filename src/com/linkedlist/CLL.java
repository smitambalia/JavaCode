package com.linkedlist;

public class CLL {
    private  Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public  void  delete(int val) {
        Node node = head;
//        System.out.println(head.val);
        if(node.val == val) {
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = node.next;
            if(n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;

        } while (node != head);
    }
    public  void display() {
        Node temp = head;
        do {
            System.out.print(temp.val+ "-->");
            temp = temp.next;
        } while(temp != head);
        System.out.println("END");

    }
    public void insert(int val) {
        Node node = new Node(val);
        if(head ==null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
