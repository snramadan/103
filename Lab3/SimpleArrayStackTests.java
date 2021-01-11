/*
 * Simple Array Stack JUNIT Test
 *
 * @author Saba Ramadan
 * @version Lab 3
 * @version CPE103-03
 * @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.NoSuchElementException;
import java.lang.RuntimeException;

public class SimpleArrayStackTests
{
    @Test (expected = NoSuchElementException.class)
    public void testPeek_exception()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();
  
        list.peek();
    }

    @Test 
    public void testPeek()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        assertTrue(list.size() == 0);
        list.push(4);
        assertTrue(list.peek() == 4);
        assertTrue(list.size() == 1);
    }
  
    @Test (expected = NoSuchElementException.class)
    public void testPop_exception()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        list.pop();
    }

    @Test 
    public void testPop()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        list.push(2);
        list.push(4);
        list.push(6);
        assertTrue(list.size() == 3);
        assertTrue(list.pop() == 6);
        assertTrue(list.size() == 2);
    }

    @Test
    public void testSize()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        assertTrue(list.size() == 0);
    }

    @Test
    public void testSize_fail()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();   
  
        assertFalse(list.size() == 3);
    }

    @Test
    public void testCap()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        assertTrue(list.capacity() == 10);
    }

    @Test 
    public void testPush_int()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        list.push(3);
        list.push(2);
        list.pop();
        list.push(4);
        assertTrue(list.peek() == 4);
        assertTrue(list.size() == 2);
    }

    @Test
    public void testPush_expand()
    {
        SimpleArrayStack<Integer> list = new SimpleArrayStack<Integer>();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
        list.push(10);
        assertTrue(list.capacity() == 10);
        assertTrue(list.size() == 10);
        list.push(3);
        list.push(4);
        assertTrue(list.capacity() == 20);
        assertTrue(list.size() == 12);
    }

}
