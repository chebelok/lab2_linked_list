package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularLinkedList cll = new CircularLinkedList();
//        cll.insert('r', 1);
        System.out.println(cll.Length());
        cll.append('n');
        cll.append('g');
        cll.append('f');
        System.out.println(cll.Length());
        cll.insert('r', 2);
        System.out.println(cll.Length());
        cll.append('x');
        cll.insert('j', 2);
        cll.insert('p', 0);
        cll.insert('e', 7);
        System.out.println(cll.Length());
        cll.display();
        System.out.println("Hello world!");
    }
}