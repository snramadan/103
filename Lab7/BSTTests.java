/*
 * JUnit tests for Binary Search Tree
 *
 * @author Saba Ramadan
 * @version Lab 7
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
}
