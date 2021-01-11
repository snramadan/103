/*
 * JUnit tests for Binary Search Tree
 *
 * @author Saba Ramadan
 * @version Lab 8
 * @version CPE103-03
 * @version Winter 2017
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.runners.MethodSorters;

public class BSTTests 
{
   @Test
   public void test_EmptyNode_Insert()
   {
       BST<Integer> list = new BST<>();
 
       assertFalse(list.contains(3));
   }
  
   @Test
   public void test_Insert_Contains() 
   {
      BST<Integer> list = new BST<>();

      for (Integer i=0; i<20; i++) 
      {
	 list.insert(19-i);
	 list.insert(i+20);	 

      }
 
      for(Integer i=0; i<40; i++) 
      {
	 assertTrue(list.contains(i));
      }
 
      assertFalse(list.contains(42));
   }
 
   @Test
   public void test_Min() 
   {
      BST<Integer> list = new BST<>();

      list.insert(19);
      list.insert(2);	 
      assertEquals((Integer) 2, list.minimum());
   }

   @Test
   public void test_Min2()
   {
      BST<Integer> list = new BST<>();

      list.insert(1);
      list.insert(45);
      list.insert(19);
      list.insert(2);
      list.insert(17);
      list.insert(60);
      assertEquals((Integer) 1, list.minimum());
   }

   @Test
   public void test_Max2()
   {
      BST<Integer> list = new BST<>();

      list.insert(1);
      list.insert(45);
      list.insert(19);
      list.insert(2);
      list.insert(17);
      list.insert(60);
      list.insert(6);
      list.insert(23);
      assertEquals((Integer) 60, list.maximum());
   }

   @Test
   public void test_Max()
   {
      BST<Integer> list = new BST<>();

      list.insert(19);
      list.insert(2);
      assertEquals((Integer) 19, list.maximum());
   }

   @Test
   public void test_NodeSize()
   {
       BST<Integer> list = new BST<Integer>();

       list.insert(1);
       list.insert(2);
       assertTrue(list.size() == 2);
   }

   @Test
   public void test_SortedList() 
   {
      BST<Integer> list = new BST<>();
      ArrayList<Integer> sortedlist = new ArrayList<>();
      Integer[] s = new Integer[] {0, 1,  4, 24,  36};
      list.insert(24);
      list.insert(4);
      list.insert(36);
      list.insert(0);
      list.insert(1); 
      
      list.toSortedList(sortedlist);
      assertArrayEquals(s, sortedlist.toArray());
   }

   @Test
   public void test_NodeSize2()
   {
       BST<Integer> list = new BST<Integer>();

       list.insert(1);
       list.insert(2);
       list.insert(24);
       list.insert(4);
       list.insert(36);
       list.insert(0);
       list.insert(17);
       assertEquals(7, list.size());
   }

   @Test
   public void test_height()
   {
       BST<Integer> list = new BST<Integer>();

       list.insert(1);
       list.insert(2);
       list.insert(24);
       list.insert(4);

       assertEquals(3, list.treeHeight());
   }

   @Test
   public void test_height2()
   {
       BST<Integer> list = new BST<Integer>();
   
       assertEquals(-1, list.treeHeight());
   }

   @Test
   public void test_height3()
   {
       BST<Integer> list = new BST<Integer>();
   
       list.insert(1);
       assertEquals(0, list.treeHeight());
   }

   @Test
   public void test_pathLength()
   {
       BST<Integer> list = new BST<Integer>();

       assertEquals(-1, list.internalPathLength());
   }

   @Test
   public void test_pathLength2()
   {
       BST<Integer> list = new BST<Integer>();
       
       list.insert(1);
       assertEquals(0, list.internalPathLength());
   }

   @Test
   public void test_pathLength3()
   {
       BST<Integer> list = new BST<Integer>();
     
       list.insert(1);
       list.insert(2);
       list.insert(24);
       list.insert(4);  
       assertEquals(6, list.internalPathLength());
   }

   @Test
   public void test_remove()
   {
       BST<Integer> list = new BST<Integer>();

       list.insert(1);
       list.insert(2);
       list.insert(24);
       list.insert(4);

       list.remove(4);
       assertFalse(list.contains(4));      
   }

   @Test
   public void test_remove2()
   {  
      BST<Integer> list = new BST<>();
      
      for (Integer i=0; i<20; i++)
      {  
         list.insert(19-i);
         list.insert(i+20);
      }

      for(Integer i=0; i<40; i++)
      { 
         list.remove(i); 
         assertFalse(list.contains(i));
      }
      
      assertFalse(list.contains(42));
   }

   @Test (expected = NoSuchElementException.class)
   public void test_removeException()
   {
      BST<Integer> list = new BST<>();

      list.insert(1);
      list.insert(2);
      list.insert(24);
      assertEquals(3, list.size());
      list.remove(5);
      assertEquals(2, list.size());
   }

   @Test
   public void test_remove3()
   {
      BST<Integer> list = new BST<>();

      list.insert(1);
      assertEquals(1, list.size());
      list.remove(1);
      assertEquals(0, list.size());
   }

   @Test
   public void test_all()
   {
      BST<Integer> list = new BST<>();

      list.insert(15);
      list.insert(20);
      list.insert(24);
      list.insert(56);
      list.insert(1);
      list.insert(42);
      list.insert(4);
      list.insert(46);
      assertEquals(8, list.size());
      assertEquals(5, list.treeHeight());     
      assertEquals(18, list.internalPathLength()); 
      list.remove(1);
      list.remove(46);
      assertEquals(6, list.size());
      assertEquals(4, list.treeHeight());
      assertEquals(11, list.internalPathLength());      
   }
}
