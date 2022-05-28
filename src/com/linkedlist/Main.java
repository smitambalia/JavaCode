package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(10);
        list.insertFirst(25);
        list.insertFirst(80);
        list.insertFirst(95);


        //        list.insertLast(93);
////        System.out.println(list.deleteFirst());
//        list.insert(11,3);
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();
//        System.out.println(list.find(11));
//          DLL list = new DLL();
//          list.insertFirst(4);
//          list.insertFirst(9);
//          list.insertFirst(90);
////          list.display();
//          list.insertLast(100);
////          list.display();
//          list.insert(90,101);
//          list.display();
//        CLL list = new CLL();
//        list.insert(8);
//        list.insert(9);
//        list.insert(1);
//        list.insert(5);
//
//        list.display();
//        list.delete(1);
        list.display();
//        System.out.printf();
//        list.insertRec(88,2);
//        list.display();
//        list.reverseLL();
//        list.reverseLLRecursive();
//        list.display();
//        int mid = list.findMiddle();
        int mid = list.getMiddle();

        System.out.println(mid);

    }
}
