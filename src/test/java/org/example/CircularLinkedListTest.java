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



}