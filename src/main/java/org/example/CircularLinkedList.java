package org.example;


import java.util.Collection;
import java.util.LinkedList;

public class CircularLinkedList implements CharList{
    static class Node {
        Character data;
        Node next;
        public Node(Character data) {
            this.data = data;
        }
    }

    private LinkedList<Character> list;
    public  CircularLinkedList(){
        list = new LinkedList<Character>();
    }
//    int length = 0;
//    private Node head = null;

    @Override
    public int Length(){
//        return length;
        return  list.size();
    }

    @Override
    public void append(Character element){
//        Node newNode = new Node(element);
//        if (head == null) {
//            head = newNode;
//            head.next = head;
//        }else{
//            Node current = head;
//            while(current.next != head){
//                current = current.next;
//            }
//            current.next = newNode;
//            newNode.next = head;
//        }
//        length++;
        list.add(element);
    }

    @Override
    public void insert(Character element, int position) throws Exception {
        if (position < 0 || position >= list.size()) {throw new Exception("Error. Invalid position.");}
//        Node newNode = new Node(element);
//        if(position == 0){
//            newNode.next = head.next;
//            head.next = newNode;
//        }else{
//            Node current = head;
//            for(int i = 0; i < position; i++){
//                current = current.next;
//            }
//            newNode.next = current.next;
//            current.next = newNode;
//        }
//        length++;
        list.add(position, element);

    }

    public void display() {
//        Node current = head;
//        if(head == null) {
//            System.out.println("List is empty");
//        }
//        else {
//            System.out.println("Nodes of the circular linked list: ");
//            do{
//                //Prints each node by incrementing pointer.
//                System.out.print(" "+ current.data);
//                current = current.next;
//            }while(current != head);
//            System.out.println();
//        }
    }

    @Override
    public Character get(int position) throws Exception{
        if(position < 0 || position >= list.size()){ throw new Exception("Error. Invalid position.");}
//        Node current = head;
//        for(int i = 0; i < position; i++){
//            current = current.next;
//        }
//        return current.data;
        return list.get(position);
    }

    @Override
    public Character delete(int position) throws Exception{
        if(position < 0 || position >= list.size()){ throw new Exception("Error. Invalid position.");}
//        char delel = ' ';
//        if(position == 0){
//            delel = head.data;
//            Node current = head;
//            while(current.next != head){
//                current = current.next;
//            }
//            current.next = head.next;
//            head = head.next;
//        }else{
//            Node current = head;
//            for(int i =0; i < (position - 1); i++){
//                current = current.next;
//            }
//            delel = current.next.data;
//            current.next = current.next.next;
//        }
//        length--;
//        return delel;
        return list.remove(position);
    }

    @Override
    public void clear(){
//        head = null;
//        length = 0;
        list.clear();
    }

    @Override
    public void deleteAll(Character element) {
//        if (head == null) {
//            return;
//        }
//        while (head.data == element) {
//            if (head.next == head) {
//                head = null;
//            } else {
//                head = head.next;
//            }
//        }
//        Node previous = head;
//        Node current = head.next;
//
//        while (current != head) {
//            if (current.data == element) {
//                previous.next = current.next;
//                length--;
//            }
//            previous = current;
//            current = current.next;
//        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == element){list.remove(i);}
        }
    }

    @Override
    public int findFirst(Character element){
//        if(head == null){
//            return -1;
//        }
//        Node current = head;
//        int tmp = 0;
//        while(current.next != head){
//            if(current.data == element){
//                return tmp;
//            }
//            tmp++;
//            current = current.next;
//        }
//        return -1;
        return list.indexOf(element);
    }

    @Override
    public int findLast(Character element){
//        if(head == null){
//            return -1;
//        }
//            int last = -1;
//            int index = 0;
//            Node current = head;
//            while (current.next != head) {
//                if (current.data == element){
//                    last = index;
//                }
//                index++;
//                current = current.next;
//            }
//            return last;
        return list.lastIndexOf(element);
    }

    @Override
    public CircularLinkedList clone(){
        CircularLinkedList newLinkedList = new CircularLinkedList();
//        if(head==null){
//            return newLinkedList;
//        }
//        Node current = head;
//        for (int i = 0; i < length; i++){
//            newLinkedList.append(current.data);
//            current = current.next;
//        }
        if(list.size() == 0){ return newLinkedList;}
        for(Character element : list){
            newLinkedList.append(element);
        }
        return newLinkedList;
    }

    @Override
    public void extend(CircularLinkedList tmplist) throws Exception {
//        for(int i =0; i < list.Length(); i++){
//            append(list.get(i));
//        }
        for(Character element : tmplist.list){
            list.addLast(element);
        }
    }

    @Override
    public void reverse(){
//        Node previous = null;
//        Node current = head;
//        Node next = null;
//        while(current.next != head){
//            next = current.next;
//            current.next = previous;
//            previous = current;
//            current = next;
//        }
//        head = current;
//        head.next = previous;
        LinkedList<Character> reversedList = new LinkedList<Character>();
        while(!list.isEmpty()) {
            reversedList.addFirst(list.removeFirst());
        }
        list = reversedList;
    }
}
