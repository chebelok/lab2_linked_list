package org.example;

public interface CharList {

    int Length();

    void append(Character element);

    void insert(Character element, int position) throws Exception;

    Character get(int position) throws Exception;

    Character delete(int position) throws Exception;

    void clear();


}
