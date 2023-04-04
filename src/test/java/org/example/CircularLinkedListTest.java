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
        boolean len = linkedList.Length() == 0;
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
        int expLength = 0;
        assertEquals(expLength, linkedList.Length());
    }

    @Test
    public void deleteAll() throws Exception {
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('a');
        linkedList.append('g');
        assertEquals('g', linkedList.get(5).charValue());
        linkedList.deleteAll('a');
        assertEquals(4, linkedList.Length());
        assertEquals('c', linkedList.get(1).charValue());
        assertEquals('g', linkedList.get(3).charValue());
        assertEquals('d', linkedList.get(2).charValue());
    }

    @Test
    public void findFirstTest(){
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('d');
        linkedList.append('a');
        linkedList.append('g');
        assertEquals(1, linkedList.findFirst('a'));
    }

    @Test
    public void findLastTest(){
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('a');
        linkedList.append('g');
        linkedList.append('a');
        linkedList.append('h');
        assertEquals(5, linkedList.findLast('a'));
    }

    @Test
    public void cloneTest() throws Exception {
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('a');
        linkedList.append('g');
        linkedList.append('a');
        linkedList.append('h');
        CircularLinkedList newList = linkedList.clone();
        assertEquals('a', newList.get(1).charValue());
        assertEquals('g', newList.get(4).charValue());
        assertEquals('h', newList.get(6).charValue());
        assertEquals(7, newList.Length());
    }

    @Test
    public void extendTest() throws Exception{
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('a');
        CircularLinkedList list = new CircularLinkedList();
        list.append('w');
        list.append('x');
        list.append('p');
        linkedList.extend(list);
        assertEquals('x', linkedList.get(5).charValue());
        assertEquals(7, linkedList.Length());


    }

    @Test
    public void reverseTest() throws Exception {
        linkedList.append('b');
        linkedList.append('a');
        linkedList.append('c');
        linkedList.append('a');
        linkedList.append('g');
        linkedList.append('a');
        linkedList.append('h');
        linkedList.reverse();
        assertEquals('h', linkedList.get(0).charValue());
    }


}