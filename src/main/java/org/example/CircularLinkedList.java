package org.example;

public class CircularLinkedList implements CharList{
    static class Node {
        Character data;
        Node next;
        public Node(Character data) {
            this.data = data;
        }
    }
    int length = 0;
    private Node head = null;

    @Override
    public int Length(){
        return length;
    }

    @Override
    public void append(Character element){
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            head.next = head;
        }else{
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        length++;
    }

    @Override
    public void insert(Character element, int position) throws Exception {
        if (position < 0 || position >= length) {throw new Exception("Error. Invalid position.");}
        Node newNode = new Node(element);
        if(position == 0){
            newNode.next = head.next;
            head.next = newNode;
        }else{
            Node current = head;
            for(int i = 0; i < position; i++){
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        length++;
    }

    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("Nodes of the circular linked list: ");
            do{
                //Prints each node by incrementing pointer.
                System.out.print(" "+ current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    @Override
    public Character get(int position) throws Exception{
        if(position < 0 || position >= length){ throw new Exception("Error. Invalid position.");}
        Node current = head;
        for(int i = 0; i < position; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public Character delete(int position) throws Exception{
        if(position < 0 || position >= length){ throw new Exception("Error. Invalid position.");}
        char delel = ' ';
        if(position == 0){
            delel = head.data;
            Node current = head;
            while(current.next != head){
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
        }else{
            Node current = head;
            for(int i =0; i < (position - 1); i++){
                current = current.next;
            }
            delel = current.next.data;
            current.next = current.next.next;
        }
        length--;
        return delel;
    }

    @Override
    public void clear(){
        head = null;
        length = 0;
    }

    @Override
    public void deleteAll(Character element) {
        if (head == null) {
            return;
        }
        while (head.data == element) {
            if (head.next == head) {
                head = null;
            } else {
                head = head.next;
            }
        }
        Node previous = head;
        Node current = head.next;

        while (current != head) {
            if (current.data == element) {
                previous.next = current.next;
                length--;
            }
            previous = current;
            current = current.next;
        }
    }

    @Override
    public int findFirst(Character element){
        if(head == null){
            return -1;
        }
        Node current = head;
        int tmp = 0;
        while(current.next != head){
            if(current.data == element){
                return tmp;
            }
            tmp++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public int findLast(Character element){
        if(head == null){
            return -1;
        }
            int last = -1;
            int index = 0;
            Node current = head;
            while (current.next != head) {
                if (current.data == element){
                    last = index;
                }
                index++;
                current = current.next;
            }
            return last;
    }

    @Override
    public CircularLinkedList clone(){
        CircularLinkedList newLinkedList = new CircularLinkedList();
        if(head==null){
            return newLinkedList;
        }
        Node current = head;
        for (int i = 0; i < length; i++){
            newLinkedList.append(current.data);
            current = current.next;
        }

        return newLinkedList;
    }

    @Override
    public void extend(CircularLinkedList list) throws Exception {
        for(int i =0; i < list.Length(); i++){
            append(list.get(i));
        }
    }

    @Override
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;
//        while (current != head) {
//            next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        head = previous;
//        current.next = head;
        while(current != head){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = current;
        head.next = previous;
    }

}
