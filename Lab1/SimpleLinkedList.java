/*
 * Simple Linked List
 *
 * @author Saba Ramadan
 * @version Lab 1
 * @version CPE103-03
 * @version Winter 2017
 */

import java.lang.Object;
import java.util.*;

public class SimpleLinkedList<T> implements SimpleList<T>
{
    //instance variables
    private Node head;
    private Node tail;
    private int size;

    //constructor setting everything to null and size to 0 
    public SimpleLinkedList()
    {
        this.head = null;
        this.tail = null;
	this.size = 0;
    }

    //private class Node that sets up the doubly linked list
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
 
    //private method that allows access to a node in a faster way for other methods
    private Node getNode(int i)
    {   
        Node p = head;
        int pos = 0;
        if (i <= size/2)
        {  
           while (pos != i)
           {   
               p = p.next;
               pos++;
           }
        }
        else
        {   
            p = tail;
            pos = size-1; 
            while (pos != i)
            {  
               p = p.prev;
               pos--;
            }
        }
        return p;
    }

    //adding element to specific method, raising exception if index is out of bounds
    public void add(int index, T element)
    {
        if (index > size || index < 0)
        {   
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(element);
        if (size == 0)
        {   
            head = newNode;
            tail = newNode;
            size++;
        }
        else if (index == 0)
        {   
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
        else if (index == size)
        {   
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
        else
        {   
            Node p = getNode(index-1);
            newNode.prev = p;
            p.next.prev = newNode;
            newNode.next = p.next;
            p.next = newNode;
            size++;
        }   
    }
   
    //adding element
    public void add(T element)
    {
        Node newNode = new Node(element);
        if (size == 0)
        {   
            head = newNode;
            tail = newNode;
        }
        else
        {   
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }  
        size++;   
    }
 
    //getting element at specific index by using getNode method, throws exception if index is out of bounds
    public T get(int index)
    {
        if (index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node p = getNode(index);
        return p.element;
    }

    //removing element at specified index, throws exception if index out of bounds
    public T remove(int index)
    {
        if (head == null || index >= size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }
        Node rp = null;
        Node p = getNode(index);
        if (size == 1)
        {
            rp = head;
            head = null;
            tail = null;
            size = 0;
        }
        else if (index == 0)
        {
            rp = head;
            head = head.next;
            head.prev = null;
            size--;
        }
        else if (index == size-1)
        {
            rp = tail;
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        else
        {
            rp = p;
            p.prev.next = p.next;
            p.next.prev = p.prev;
            p = null;
            size--;
        }
        return rp.element;    
    }

    //returns size
    public int size()
    {
        return size;
    }   
}
