/*
 * Simple Array Stack
 *  
 * @author Saba Ramadan
 * @verion Lab 4
 * @version CPE103-03
 * @version Winter 2017
 */

import java.util.*;

public class SimpleArrayStack<T> implements SimpleStack<T>
{
    private T[] arr;
    private int size;

    @SuppressWarnings("unchecked")
    //creates empty stack, init cap of 10, size = 0
    public SimpleArrayStack()
    {
        arr = (T[])new Object[10];
        this.size = 0;   
    }

    //Returns the element on the top of this stack (but does not remove it).
    public T peek()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        return arr[size - 1];
    }

    //Removes and returns the element on the top of this stack.
    public T pop()
    {
        if (size == 0)
        {
            throw new NoSuchElementException();
        }
        T x = arr[size - 1];
        size--;
        return x;       
    }

    @SuppressWarnings("unchecked")
    //Adds the specified element to the top of this stack.
    public void push(T element)
    {
        if (size == arr.length)
        {
            T[] arr2 = (T[])new Object[size*2];
            for (int i = 0; i < arr.length; i++)
            {
                 arr2[i] = arr[i];
            }
            arr = arr2;  
        }
        arr[size] = element;
        size++;
    }

    //returns size
    public int size()
    {
        return size;
    }

    //The method must return the length of the array representing the stack.
    public int capacity()
    {
        return arr.length;
    }
}
