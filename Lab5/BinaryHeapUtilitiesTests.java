/*
 * Binary Heap Utilities JUnit Tests
 *  
 *  @author Saba Ramadan
 *  @version Lab 5
 *  @version CPE103-03
 *  @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;
import java.lang.*;

public class BinaryHeapUtilitiesTests
{
    @Test (expected = IllegalArgumentException.class)
    public void testHeight_exception()
    {
        BinaryHeapUtilities.height(-1);   
    } 
  
    @Test
    public void testHeight()
    {
        assertEquals((int)2 , BinaryHeapUtilities.height(6));       
    }

    @Test
    public void testHeight2()
    {
        assertEquals((int)8 , BinaryHeapUtilities.height(500));
    }

    @Test
    public void testisHeap()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4};
        assertTrue(BinaryHeapUtilities.isHeap(heap, 3));
    }

    @Test
    public void testisHeap2()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4};
        assertTrue(BinaryHeapUtilities.isHeap(heap, 2));
    }

    @Test
    public void testisHeap3()
    {
        Integer[] heap = new Integer[] {1, 2};
        assertTrue(BinaryHeapUtilities.isHeap(heap, 1));
    }

    @Test
    public void testisHeap4()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4};
        assertFalse(BinaryHeapUtilities.isHeap(heap, 0));
    }

    @Test
    public void testisHeap_failSize()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 2};
        assertFalse(BinaryHeapUtilities.isHeap(heap, -1));
    }
  
    @Test
    public void testisHeap_fail()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 2};
        assertFalse(BinaryHeapUtilities.isHeap(heap, 3));
    }

    @Test (expected = IndexOutOfBoundsException.class) 
    public void testParentOf_exception()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4};
        BinaryHeapUtilities.parentOf(-1, heap, 3);       
    }

    @Test (expected = NoSuchElementException.class)
    public void testParentOf_exception2()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        BinaryHeapUtilities.parentOf(1, heap, 1);
    }  

    @Test (expected = NoSuchElementException.class)
    public void testParentOf_exception2b()
    {
        Integer[] heap = new Integer[] {1, null, 8, 10};
        BinaryHeapUtilities.parentOf(1, heap, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testParentOf_exception3()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 2};
        BinaryHeapUtilities.parentOf(2, heap, 3);
    }

    @Test 
    public void testparentOf()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        assertEquals((Integer)6 , BinaryHeapUtilities.parentOf(3, heap, 3));
    }

    @Test
    public void testparentOf_2()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10, 12, 14, 16};
        assertEquals((Integer)8 , BinaryHeapUtilities.parentOf(4, heap, 6));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testleftchildOf_exception()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4};
        BinaryHeapUtilities.leftChildOf(4, heap, 3);
    }

    @Test (expected = NoSuchElementException.class)
    public void testleftchildOf_exception2()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        BinaryHeapUtilities.leftChildOf(3, heap, 3);
    }

    @Test (expected = NoSuchElementException.class)
    public void testleftchildOf_exception2b()
    {
        Integer[] heap = new Integer[] {1, 6, null, 10};
        BinaryHeapUtilities.leftChildOf(1, heap, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testleftchildOf_exception3()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 2};
        BinaryHeapUtilities.leftChildOf(1, heap, 3);
    }

    @Test
    public void testLeftChildOf()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        assertEquals((Integer)8, BinaryHeapUtilities.leftChildOf(1, heap, 3));
    }

   @Test (expected = IndexOutOfBoundsException.class)
    public void testrightchildOf_exception()
    {
        Integer[] heap = new Integer[] {1, 2, 3, 4, 5 ,6};
        BinaryHeapUtilities.rightChildOf(7, heap, 5);
    }

    @Test (expected = NoSuchElementException.class)
    public void testrightchildOf_exception2()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        BinaryHeapUtilities.rightChildOf(2, heap, 3);
    }

    @Test (expected = NoSuchElementException.class)
    public void testrightchildOf_exception2b()
    {
        Integer[] heap = new Integer[] {1, 6, 8, null};
        BinaryHeapUtilities.rightChildOf(1, heap, 3);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testrightchildOf_exception3()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 2};
        BinaryHeapUtilities.rightChildOf(1, heap, 3);
    }

    @Test
    public void testRightChildOf()
    {
        Integer[] heap = new Integer[] {1, 6, 8, 10};
        assertEquals((Integer)10, BinaryHeapUtilities.rightChildOf(1, heap, 3));
    }
}   
