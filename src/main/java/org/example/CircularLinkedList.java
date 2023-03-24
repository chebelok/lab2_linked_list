package org.example;

public class CircularLinkedList implements CharList{


    private static class Node {
        char data;
        Node next;
        public Node(char data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    int length = 0;

    @Override
    public int Length(){
        System.out.println(length);
        return length;
    }


    @Override
    public void append(Character element){
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        tail.next = head;
        length++;
    }



}
