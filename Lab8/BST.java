import java.util.List;
import java.util.NoSuchElementException;
import java.lang.*;

/**
 * Provided BST class skeleton for students to complete. This class makes use
 * of Object Oriented structural recursion to solve the problem.
 *
 * Original Revision:
 * @author Hatalsky/Jones
 * @version Lab 8
 *
 * Completed By:
 * @author Saba Ramadan
 */
public class BST<T extends Comparable<? super T>> {
   // Instance variables for BST class.
   // These are the only ones allowed!
   private final BSTNode<T> EMPTY_NODE = new EmptyNode();
   private BSTNode<T> root = EMPTY_NODE;
   private int size;

   // Polymorphic BST node type!
   private interface BSTNode<T> {
      public BSTNode<T> insert(T element);
      public boolean contains(T element);
      public T minimum(T minimum);
      public T maximum(T maximum);
      public void toSortedList(List<T> list);
      public BSTNode<T> remove(T element);
      public int treeHeight();
      public long internalPathLength(int depth);
   }

   ////////////////////////////////////////////////////////////////////////////
   // BST class methods...
   //

   /**
    * Inserts an element into the BST.  If the element is already in the BST,
    * the element being inserted is discarded.
    *
    * @param element The element to insert into the BST
    *
    * @throws IllegalArgumentException if the element is null
    */
   public void insert(T element) {
      if (element == null) {
         throw new IllegalArgumentException();
      }

      root = root.insert(element);
   }

   /**
    * Determines whether or not an element is in the BST.
    *
    * @param element the element to search for in the BST
    *
    * @return true if the element is in the BST, false otherwise
    */
   public boolean contains(T element) {
      if (element == null) {
         return false;
      }

      return root.contains(element);
   }

   /**
    * Finds the minimum element in the BST.
    *
    * @return the minimum element in the BST
    *     
    * @throws NoSuchElementException if the BST is empty
    */
   public T minimum() {
      if (size == 0) {
         throw new NoSuchElementException();
      }

      return root.minimum(((Node)root).element);
   }

   /**
    * Finds the maximum element in the BST.
    *
    * @return the maximum element in the BST
    *
    * @throws NoSuchElementException if the BST is empty
    */
   public T maximum() {
      if (size == 0) {
         throw new NoSuchElementException();
      }

      return root.maximum(((Node)root).element);
   }

   /**
    * Takes the elements in the BST and places them in ascending order into the
    * list.
    *
    * @param list the list in which you will place elements
    */
   public void toSortedList(List<T> list) {
      root.toSortedList(list);
   }

   public int size() {
      return size;
   }

   //throws exception to make sure remove works correctly
   public void remove(T element)
   {
       if (root.contains(element) == false)
       {
           throw new NoSuchElementException();
       }
       size--;
       root = root.remove(element);
   }

   //checks size and returns approiate height 
   public int treeHeight()
   {
       if (size == 0)
       {
           return -1;
       }
       if (size == 1)
       {
           return 0;
       }
       return root.treeHeight()-1;
   }

   //sum of depth of all nodes in tree
   public long internalPathLength()
   {
       if (size == 0)
       {
           return -1;
       }
       if (size == 1)
       {
           return 0;
       }
       return root.internalPathLength(0);   
   }

   ////////////////////////////////////////////////////////////////////////////
   // private EmptyNode class...
   //
   private class EmptyNode implements BSTNode<T> {
      // No instance variables needed or allowed!

      public BSTNode<T> insert(T element) 
      {
          size++;
          return new Node(element, EMPTY_NODE, EMPTY_NODE); 
      }

      public boolean contains(T element) 
      {
          return false;
      }
      
      public T minimum(T element) 
      {
          return element;
      }

      public T maximum(T element) 
      {
          return element;
      }
      
      public void toSortedList(List<T> list) 
      {        
      }

      //empty so throws exception
      public BSTNode<T> remove(T element)
      {
         throw new NoSuchElementException();
      }
     
      //length of longest children
      public int treeHeight()
      {
          return 0;  
      }

      //sum of depth of all nodes in tree
      public long internalPathLength(int depth)
      {
          return 0;
      }
   }

   ////////////////////////////////////////////////////////////////////////////
   // private Node class...
   //
   private class Node implements BSTNode<T> {
      // These are the only instance variables needed and the only ones
      // allowed!
      T element;
      BSTNode<T> left, right;

      // You may (and probably want to) write constructor(s)

      public Node(T element, BSTNode<T> left, BSTNode<T> right)
      {
         this.element = element;
         this.left = left;
         this.right = right; 
      }

      //puts in elements
      public BSTNode<T> insert(T element) 
      {
          if (this.element.compareTo(element) > 0)
          {
              left = left.insert(element);
          }
          else if (this.element.compareTo(element) < 0)
          {
              right = right.insert(element);
          }
          return this;
      }

      //checks element is in the BST list
      public boolean contains(T element) 
      {  
          if (this.element.compareTo(element) == 0)
          { 
             return true; 
          }
          if (this.element.compareTo(element) > 0)
          {
             return left.contains(element);   
          }
          else
          {
             return right.contains(element);
          }        
      }

      //recurses through left side
      public T minimum(T element) 
      {
          return left.minimum(this.element);
      }
 
      //recurses through right side
      public T maximum(T element) 
      {
          return right.maximum(this.element);
      }

      //sorts list
      public void toSortedList(List<T> list) 
      {
          left.toSortedList(list);
          list.add(element);
          right.toSortedList(list);
      }
 
      //removes element 
      public BSTNode<T> remove(T element)
      { 
         if (element.compareTo(this.element) == 0)
         {
             if (left != EMPTY_NODE && right == EMPTY_NODE)
             {
                 return left;
             }
             if (left == EMPTY_NODE && right != EMPTY_NODE)
             {
                 return right;
             }
             if (left != EMPTY_NODE && right != EMPTY_NODE)
             {
                 T hold = right.minimum(element);
                 this.element = hold;
                 right.remove(right.minimum(hold));
                 return this;
             }
             else if (left == EMPTY_NODE && right == EMPTY_NODE)
             {
                 return EMPTY_NODE;
             }
         }
         if (element.compareTo(this.element) > 0)
         {
             right = right.remove(element);
         }
         else if (element.compareTo(this.element) < 0)
         {
             left = left.remove(element);
         }
         return this;        
      }

      //length of longest children
      public int treeHeight()
      {
         return Math.max(left.treeHeight(), right.treeHeight()) + 1;   
      }

      //sum of depth of all nodes in tree
      public long internalPathLength(int depth)
      {
         return depth + left.internalPathLength(depth+1) + right.internalPathLength(depth+1);
      }
   }
}

