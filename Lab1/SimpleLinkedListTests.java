/**
 * JUnit tests for SimpleLinkedList.
 *
 * @author Paul Hatalsky + Saba Ramadan 
 * @version Lab 1
 */
import org.junit.*;
import static org.junit.Assert.*;
//import java.lang.reflect.*;

public class SimpleLinkedListTests {
   @Test
   public void testSize_empty() {
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
      assertEquals(0, list.size());
   }

   @Test(expected=IndexOutOfBoundsException.class)
   public void testAdd_atConstuctionOutOfBounds() {
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
      list.add(25, null);
   }

   @Test(expected=IndexOutOfBoundsException.class)
   public void testRemove_atConstruction() {
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
      list.remove(0);
   }

   @Test
   public void testAddSize() {
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(5);
      list.add(10);
      list.add(15);
      list.add(3, 20);
      listEquals(list, new Integer[] {5, 10, 15, 20});
   }

   private void listEquals(SimpleLinkedList list, Object[] a) {
      assertEquals(a.length, list.size());
      for (int i = 0; i < a.length; i++) {
         assertEquals(a[i], list.get(i));
      }
   }
 
   @Test
   public void testAddAtIndex() {
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(3);
      list.add(10);
      list.add(1);
      list.add(4);
      list.add(1, 20);
      list.add(4, 30);
      listEquals(list, new Integer[] {3, 20, 10, 1, 30, 4});
   }

   @Test
   public void testRemove() {
     SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(3);
      list.add(10);
      list.add(1);
      list.add(4);
      list.remove(2);
      listEquals(list, new Integer[] {3, 10, 4});
   }
  
   @Test
   public void testGet() {
     SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(3);
      list.add(10);
      list.add(1);
      list.add(4);
      assertEquals(list.get(1), (Integer)10);
      assertEquals(list.size(), 4);
   } 

   @Test
   public void addToEmpty(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      assertEquals(list.size(), 0);
      list.add(1);
      assertEquals(list.size(), 1);       
   }   

   @Test (expected=IndexOutOfBoundsException.class)
   public void gettingFromEmpty(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
     
      list.get(0);
   }
  
   @Test (expected=IndexOutOfBoundsException.class)
   public void gettingOutOfBound(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(1);
      list.add(10);
      list.add(20);
      assertEquals(list.size(), 3);
      list.get(3);
   } 

   @Test (expected=IndexOutOfBoundsException.class)
   public void removeWithException(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(3);
      list.add(10);
      list.add(30);
      list.add(3,20);
      list.get(4);
   }

   @Test (expected=IndexOutOfBoundsException.class)
   public void addException(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

      list.add(1);
      list.add(40);
      list.add(20);
      list.add(5, 30);
   }
   
   @Test 
   public void sizeFail(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
 
      assertFalse(list.size()== 2);
   }
   
   @Test
   public void sizeFail2(){
      SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();
 
      list.add(2);
      list.add(4);
      assertFalse(list.size() == 3);
   }
}
