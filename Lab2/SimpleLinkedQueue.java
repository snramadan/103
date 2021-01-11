/*
  Simpl Linked Queue
 *
 * @author Saba Ramadan
 * @version Lab 2
 * @version CPE103-03
 * @version Winter 2017
 */

import java.lang.Object;
import java.util.*;

public class SimpleLinkedQueue<T> implements SimpleQueue<T>
{
    //instance variables
    private Node front;
    private Node back;
    private int size;

    //constructor that empties queue
    public SimpleLinkedQueue()
    {
        this.front = new Node(null);
        this.back = new Node(null);
        this.size = 0;
        front.next = back;
        back.prev = front;
    }

    //private class Node that sets up the list
    private class Node
    {
        public T element;
        public Node next;
        public Node prev;

        public Node(T element)
        {
            this.element = element;
            this.next = null;
            this.prev = null;
        }
    }

    //Removes and returns the element at the front of this queue.
    //catches exception if list is empty 
    public T dequeue()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
            //save value to return later
            T s = front.next.element;
            //set the new front value
            front.next = front.next.next;
            //make the original value null(front) 
            front.next.prev = front;
            //decrement
            size--;
            //return original element
            return s;
        }
    }
    
    //Adds the specified element to the end of this queue.
    public void enqueue(T element)
    {
        //create node
        Node newNode = new Node(element);
        //setting the the prev of the newNode value to the spot between back.prev and back
        newNode.prev = back.prev.next;
        //setting that value to the element
        back.prev.next = newNode;
        back.prev = newNode;
        //setting the back to the newNode's next 
        newNode.next = back;
        //increment
        size++;             
    }
   
    //Returns the element at the front of this queue (but does not remove it).
    //catches exception if list is empty
    public T peek()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return front.next.element;
        }
    }

    //Returns the number of elements in this queue.
    public int size()
    {
       return size;
    }
} 
