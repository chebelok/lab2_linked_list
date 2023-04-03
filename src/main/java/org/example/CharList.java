package org.example;

public interface CharList {

    int Length();

    void append(Character element);

    void insert(Character element, int position) throws Exception;

    Character get(int position) throws Exception;

    Character delete(int position) throws Exception;

    void clear();

    void deleteAll(Character element);

    int findFirst(Character element);

    int findLast(Character element);

    CircularLinkedList clone();

    void extend(CircularLinkedList list) throws Exception;

    void reverse();
}
