package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        CircularLinkedList linkedList;
        linkedList = new CircularLinkedList();
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        linkedList.insert('r', 1);
        linkedList.insert('r', 3);
        linkedList.display();
        System.out.println(linkedList.get(0));
        linkedList.display();
        System.out.println(linkedList.findFirst('r'));
        System.out.println(linkedList.findLast('r'));
        linkedList.clear();
        linkedList.display();
        linkedList.deleteAll('r');
        linkedList.display();
        System.out.println(linkedList.Length());
        System.out.println("Hello world!");
    }
}