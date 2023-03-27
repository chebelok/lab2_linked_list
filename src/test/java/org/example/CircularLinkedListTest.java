package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircularLinkedListTest {
    public CircularLinkedList linkedList;

    @Before
    public void setUpSettings(){
        linkedList = new CircularLinkedList();
    }

    @Test
    public void lengthTest(){
        int expected = 0;
        assertEquals(expected, linkedList.Length());
    }

    @Test
    public void nonZeroLengthTest(){
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        int expected = 5;
        assertEquals(expected, linkedList.Length());
    }

    @Test
    public void appendTest(){
        linkedList.append('a');
        linkedList.append('b');
        boolean len = linkedList.length == 0;
        assertFalse(len);
    }

    @Test
    public void getTest() throws Exception {
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        char expected = linkedList.get(2);
        assertEquals('c', expected);
    }

    @Test
    public void insertTest() throws Exception {
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        linkedList.insert('q', 2);
        char expected = 'q';
        assertEquals(expected, linkedList.get(3).charValue());
    }

    @Test
    public void deleteTest() throws Exception{
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        char expected = 'c';
        assertEquals(expected, linkedList.delete(2).charValue());
    }

    @Test
    public void deleteBeginningTest() throws Exception{
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        char expected = 'a';
        assertEquals(expected, linkedList.delete(0).charValue());
    }

    @Test
    public void clearTest(){
        linkedList.append('a');
        linkedList.append('b');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('e');
        linkedList.clear();
        int expLenght = 0;
        assertEquals(expLenght, linkedList.Length());
    }


}