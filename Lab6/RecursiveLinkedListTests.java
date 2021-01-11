/*
 * Junit Tests
 *
 * @author Saba Ramadan
 * @version Lab 6
 * @version CPE103-03
 * @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;
import java.lang.*;

public class RecursiveLinkedListTests
{
    @Test (expected = IndexOutOfBoundsException.class)
    public void addSimple2_Exception()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(-1, 16);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void addSimple2_Exception_2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(1, 16);
        list.add(10, 16);
    }

    @Test
    public void addSimple2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 16);
        list.add(1, 8);
        list.add(2, 4);
        assertEquals((Integer)8, list.get(1));
    }

    @Test
    public void addSimple2_2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 16);
        list.add(1, 8);
        list.add(2, 4);
        list.add(3, 7);
        assertEquals((Integer)7, list.get(3));
        assertTrue(list.size() == 4);
    }
  
    @Test
    public void addSimple2_3()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 16);
        list.add(1, 8);
        list.add(2, 4);
        assertFalse(list.get(1) == 16);
        assertFalse(list.size() == 4);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getSimple_Exception()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.get(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void getSimple_Exception2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 3);
        list.get(16);
    }

    @Test
    public void getSimple()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        assertEquals((Integer)3, list.get(2));   
    }

    @Test
    public void getSimple_2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        assertTrue(list.size() == 3);
        assertEquals((Integer)3, list.get(2));
        list.remove(2);
        assertTrue(list.size() == 2);
    }
   
    @Test (expected = IndexOutOfBoundsException.class)
    public void removeSimple_Exception()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.remove(-1);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void removeSimple_Exception2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.remove(1);
    }

    @Test
    public void removeSimple()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        assertEquals((Integer)3, list.get(2));
        assertEquals((Integer)3, list.remove(2));
    }

    @Test
    public void removeSimple_2()
    {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

        list.add(0, 10);
        list.add(1, 20);
        list.add(2, 30);
        list.add(3, 40);
        assertTrue(list.size() == 4);
        assertEquals((Integer)30, list.get(2));
        assertEquals((Integer)30, list.remove(2));
        assertTrue(list.size() == 3);
        assertEquals((Integer)40, list.get(2));
        assertEquals((Integer)40, list.remove(2));
        assertTrue(list.size() == 2);
    }

    @Test
    public void testall()
    {
       RecursiveLinkedList<Integer> list = new RecursiveLinkedList<Integer>();

       list.add(0, 2);
       list.add(1, 4);
       assertTrue(list.size() == 2);
       list.remove(0);
       assertEquals((Integer)4, list.get(0));
       assertTrue(list.size() == 1); 
    }
}
