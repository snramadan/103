/*
 * JUnit
 *
 * @author Saba Ramadan
 * @version Lab 2
 * @verison CPE103-03
 * @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.NoSuchElementException;

public class SimpleLinkedQueueTests
{
    @Test 
    public void testSize_empty()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
 
        assertEquals(0, list.size());
    }

    @Test
    public void testSize_empty2()
    {   
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
    
        assertFalse(list.size() == 2);
    }

    @Test 
    public void testSize_false() 
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
     
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        assertFalse(list.size() == 5);
    }
  
    @Test
    public void testSize_true()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
     
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        list.enqueue(60);
        list.enqueue(10);
        assertTrue(list.size() == 5);
    }

    @Test
    public void testSize_increase()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        assertTrue(list.size() == 0);
        list.enqueue(2);
        assertTrue(list.size() == 1);
        list.enqueue(3);
        assertTrue(list.size() == 2);
        list.enqueue(20);
        assertTrue(list.size() == 3);
        list.enqueue(60);
        assertTrue(list.size() == 4);   
        list.enqueue(10);
        assertTrue(list.size() == 5);
    }

    @Test
    public void testSize_decrease()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
    
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        list.enqueue(60);
        list.enqueue(10);    
        assertTrue(list.size() == 5);
        list.dequeue();
        assertTrue(list.size() == 4);
        list.dequeue();
        assertTrue(list.size() == 3);
        list.dequeue();
        assertTrue(list.size() == 2);
        list.dequeue();
        assertTrue(list.size() == 1);
        list.dequeue();
        assertTrue(list.size() == 0);
    }

    @Test
    public void testPeek_pass() 
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
     
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        list.enqueue(60);
        list.enqueue(10);
        assertEquals(list.peek(), (Integer)2); 
        assertEquals(list.size(), 5);
    }
  
    @Test
    public void testPeek_fail()      
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();
     
        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        list.enqueue(60);
        list.enqueue(10);
        assertFalse(list.peek() == 20);
    }
 
    @Test (expected = NoSuchElementException.class)
    public void testPeek_exception()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.peek();
    }
  
    @Test (expected = NoSuchElementException.class)
    public void testDequeue_exception()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.dequeue();       
    }
    
    @Test 
    public void testDequeue_pass()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        assertEquals(list.peek(), (Integer)2);
        assertEquals(list.size(), 3);
        list.dequeue();
        assertEquals(list.peek(), (Integer)3);
        assertEquals(list.size(), 2);
        list.dequeue();
        assertEquals(list.peek(), (Integer)20);
        assertEquals(list.size(), 1);
         
    }
  
    @Test
    public void testDequeue_fail()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.enqueue(2);
        list.enqueue(3);
        list.enqueue(20);
        assertEquals(list.size(), 3);
        list.dequeue();
        assertFalse(list.equals(new Integer[] {3, 20}));
        assertEquals(list.size(), 2);
    }
   
    @Test
    public void testEnqueue_pass()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.enqueue(2);
        list.enqueue(4);
        assertEquals(list.size(), 2);
        assertEquals(list.peek(), (Integer)2);
    }

    @Test
    public void testEnqueue1()
    {
        SimpleLinkedQueue<Integer> list = new SimpleLinkedQueue<Integer>();

        list.enqueue(2);
        list.enqueue(4);
        assertEquals(list.size(), 2);
        assertEquals(list.peek(), (Integer)2);
        list.enqueue(2);
        list.enqueue(2);
        assertEquals(list.size(), 4);
        list.dequeue();
        assertEquals(list.size(), 3);
    } 
}
