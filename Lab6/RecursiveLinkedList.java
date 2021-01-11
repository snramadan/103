/**
 * A provided, partially complete, simple, recursive, singly-linked list
 * for CPE 103 Lab 6.
 *
 * @author Saba Ramadan
 * @author Hatalsky/Jones (Provided skeleton).
 *
 * Insert you name as the second author below as the person that completed
 * the class.
 *
 * @author 
 * @version CPE 103 Lab 6
 */
// Class invariants:
//
// The head reference is never null.
// The head node's next field will be null when the list is empty.
// The next field of the last node in the list is always null.

import java.lang.*;
import java.util.*;

public class RecursiveLinkedList<T> implements SimpleList<T> {
   private class Node {
      public Node next;
      public T e;

      public Node() {
      }

      public Node(Node next, T e) {
         this.next = next;
         this.e = e;
      }
   }

   private Node head;
   private Throwable stackTrace;

   public RecursiveLinkedList() {
      head = new Node();
   }

   public void add(T element) {
      head.next = add(head.next, element);
   }

   public void addSimple(T element) {
      addSimple(head, element);
   }

   public void add(int index, T element) 
   {
      if (index < 0)
      {
          throw new IndexOutOfBoundsException();
      }
      addSimple2(head, index, element);
   }

   // Private recursive helper method for public add(index, element)
   private void addSimple2(Node node, int index, T element)
   {
      stackTrace = new Throwable();

      if (index == 0)
      {
          node.next = new Node(node.next, element);
      }
      else if (node.next == null)
      {
          throw new IndexOutOfBoundsException();
      }
      else
      {   
          index--;
          addSimple2(node.next, index, element);
      }
   }

   public T get(int index) 
   {
      if (index < 0)
      {
          throw new IndexOutOfBoundsException();
      }
      return getSimple(head, index);
   }

   // Private recursive helper method for public get(index)
   private T getSimple(Node node, int index)
   {
      stackTrace = new Throwable();

      if (index == 0)
      {
          return node.next.e;
      }
      else if (node.next == null)
      {
          throw new IndexOutOfBoundsException();
      }
      else
      {
          index--;
          return getSimple(node.next, index);    
      }
   }

   public T remove(int index) 
   {
      if (index < 0)
      {
          throw new IndexOutOfBoundsException();
      }
      return removeSimple(head, index);
   }

   // Private recursive helper method for public remove(index)
   private T removeSimple(Node node, int index)
   {
      stackTrace = new Throwable();

      if (index == 0)
      {
          T temp = node.next.e;
          node.next = node.next.next;
          return temp;
      }
      else if (node.next == null)
      {
          throw new IndexOutOfBoundsException();
      }
      else
      {
          index--;
          return removeSimple(node.next, index);    
      }
   }

   public int size() {
      return size(head.next);
   }

   public Throwable stackTrace() {
      return stackTrace;
   }

   // Private recursive helper method for public add(T)
   private Node add(Node node, T e) {
      stackTrace = new Throwable();

      if(node == null) {
         return new Node(null, e);
      } else {
         node.next = add(node.next, e);
      }

      return node;
   }

   // Private ALTERNATE recursive helper method for public add(T)
   private void addSimple(Node node, T e){
      stackTrace = new Throwable();

      if(node.next == null){
         node.next = new Node(null, e);
      } else {
         addSimple(node.next, e);
      }
   }

   // Private recursive helper method for public size(int) 
   private int size(Node node) {
      stackTrace = new Throwable();

      if (node == null) {
         return 0;
      }

      return 1 + size(node.next);
   }
}
