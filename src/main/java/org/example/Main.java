package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularLinkedList linkedList = new CircularLinkedList();
////        cll.insert('r', 1);
//        System.out.println(cll.Length());
//        cll.append('n');
//        cll.append('g');
//        cll.append('f');
//        System.out.println(cll.Length());
//        cll.insert('r', 2);
//        System.out.println(cll.Length());
//        cll.append('x');
//        cll.insert('j', 2);
//        cll.insert('p', 0);
//        cll.insert('e', 6);
//        System.out.println(cll.Length());
//        cll.display();
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        linkedList.display();
//        System.out.println(linkedList.get(2));
        System.out.println(linkedList.delete(0));
        System.out.println(linkedList.get(0));
        linkedList.display();
        linkedList.clear();
        linkedList.display();
        System.out.println(linkedList.Length());
        System.out.println("Hello world!");
    }
}