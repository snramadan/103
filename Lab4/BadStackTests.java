/*
 * Bad Stack JUNIT Test
 *
 * @author Saba Ramadan
 * @version Lab 4
 * @version CPE103-03
 * @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.NoSuchElementException;
import java.lang.RuntimeException;

public class BadStackTests
{
    @Test (expected = NoSuchElementException.class)
    public void testPeek_exception()
    {
        BadStack<Integer> list = new BadStack<Integer>();
  
        list.peek();
    }

    @Test 
    public void testPeek()
    {
        BadStack<Integer> list = new BadStack<Integer>();

        assertTrue(list.size() == 0);
        list.push(4);
        assertTrue(list.peek() == 4);
        assertTrue(list.size() == 1);
    }
  
    @Test (expected = NoSuchElementException.class)
    public void testPop_exception()
    {
         BadStack<Integer> list = new BadStack<Integer>();

        list.pop();
    }

    @Test 
    public void testPop()
    {
        BadStack<Integer> list = new BadStack<Integer>();

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
        BadStack<Integer> list = new BadStack<Integer>();

        assertTrue(list.size() == 0);
    }

    @Test
    public void testSize_fail()
    {
        BadStack<Integer> list = new BadStack<Integer>();   
  
        assertFalse(list.size() == 3);
    }

    @Test
    public void testCap()
    {
        BadStack<Integer> list = new BadStack<Integer>();

        assertTrue(list.capacity() == 10);
    }

    @Test 
    public void testPush_int()
    {
        BadStack<Integer> list = new BadStack<Integer>();

        list.push(3);
        list.push(2);
        assertTrue(list.peek() == 2);
        assertTrue(list.pop() == 2);
        list.push(4);
        assertTrue(list.peek() == 4);
        assertTrue(list.size() == 2);
    }

    @Test
    public void testPush_expand()
    {
        BadStack<Integer> list = new BadStack<Integer>();

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
 
    @Test
    public void t3()
    {
        BadStack<Integer> list = new BadStack<Integer>();
        
        list.push(0);
        list.push(1);      
        list.push(2); 
  
        assertTrue(list.pop() == 2);
        assertTrue(list.pop() == 1);
        assertTrue(list.pop() == 0);
    }

    @Test
    public void t4()
    {
        BadStack<Integer> list = new BadStack<Integer>();

        list.push(2);
        list.push(3);
        list.push(5);

        assertTrue(list.pop() == 5);
        assertTrue(list.pop() == 3);
        assertTrue(list.pop() == 2);
    }

    @Test
    public void t5()
    {
        BadStack<Integer> list = new BadStack<Integer>();

        list.push(101);
        list.push(102);
        list.pop();
        list.push(14);
        list.push(15);
        list.pop();
        assertEquals((Integer)14, list.peek());
    }
}
