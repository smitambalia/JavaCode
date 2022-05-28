package com.linkedlist;

public class Dymmy {
    private  Node head;

    public static void main(String[] args) {
//        int n = 5;
//        fun(n);
        Dymmy v1 = new Dymmy();
        int val = 10;
        v1.insertAtFirst(10);
        v1.insertAtFirst(50);
        v1.insertLast(60);
        v1.display();
        v1.reverseLL();
        System.out.println("");
        v1.display();
    }

    public  void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+ "-->");
            temp = temp.next;
        }
    }

    public  void reverseLL () {
        if(head == null || head.next == null) return;

        Node prev = null;
        Node curr = head;
        Node forward;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        head = prev;
    }
    public  void insertAtFirst(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;

    }
    public  void insertLast(int val) {
        if(head == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }
    public static  void  fun(int n) {
        if(n==0) return;

        System.out.println("n1 = " + n);
        fun(n-1);
        System.out.println("n = " + n);

    }
    private  class  Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
