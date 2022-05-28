package com.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;

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
//     insert using recursion
    public  void insertRec(int value, int index) {
        head = insertRec(value,index,head);
    }

    private  Node insertRec(int value , int index, Node node) {
        System.out.printf("FOr the head " + index);
        System.out.println(node.value);
        if(index == 0) {
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next = insertRec(value,--index,node.next);

        return node;
    }

    public void kReverse(int k) {
        if(head == null|| head.next == null) return;
        int cnt = 0;
        Node prev = null;
        Node curr = head;
        Node fast = null;

        while(cnt < k || curr.next != null) {
            fast = curr.next;
            curr.next = prev ;
            prev = curr;
            curr = fast;
        }
    }
    public int getMiddle() {
        if(head == null) return -1;
        if(head.next == null) return  head.value;
        if(head.next.next == null) return head.next.value;

        Node slow = head;
        Node fast = head.next;

        while(fast != null) {
            fast = fast.next;
            if(fast != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }

        return slow.value;
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


    int getLength() {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            ++len;
        }
        return len;
    }
    int findMiddle() {
        int len = getLength();
        int mid = len /2;
        Node temp = head;
        for (int i=0; i < mid ;i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public void reverseLLRecursive() {
        Node curr = head;
        Node prev = null;
        reverse(curr,prev);
    }

    public void reverse(Node curr,Node prev) {

        if(curr == null) {
            head = prev;
            return;
        }

        reverse(curr.next, curr);
        curr.next = prev;
        System.out.println(curr.value);
    }


    public void reverseLL() {

        if(head == null || head.next == null) return;

        Node prev = null;
        Node curr = head;
        Node forward = null;

        while (curr != null) {
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        head = prev;
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
        private int value ;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
//     insert using recursion

}
