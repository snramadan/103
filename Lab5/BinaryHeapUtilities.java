/*
 * Binary Heap Utilities Class
 *
 * @author Saba Ramadan
 * @version Lab 5
 * @version CPE103-03
 * @version Winter 2017
 */

import java.util.*;
import java.lang.*;

public class BinaryHeapUtilities
{
    //Calculates the height of the heap given it's size. This will involve a log (base 2).
    public static int height(int size)
    {
        if (size <= 0)
        {
            throw new IllegalArgumentException();
        }
        double x = Math.log(size);
        double y = Math.log(2);
        int t = (int)(x/y);
        return t;       
    }

    //Checks to see if data in the specified array meets the heap order property for binary heaps
    public static <T extends Comparable<? super T>> boolean isHeap(T[] heap, int size)
    { 
        boolean temp = false; 
        if (size <= 0)
        {
            return temp;
        }
        if (size  == 1)
        {
            temp = true;
            return temp;
        }
        for (int i = 1; i < size + 1; i++)
        {
            T child = heap[i];
            int x = (int)(i/2);
            T parent = heap[x];
            if (i == 1)
            {
                parent = heap[i];
            }
            if (child.compareTo(parent) >= 0)
            {
                temp = true;
            }
            else
            {
                temp = false;
                break; 
            }
        }
        return temp;
    }

    //Returns the parent of the specified element.
    public static <T extends Comparable<? super T>> T parentOf(int index, T[] heap, int size)
    {
        if (index <= 0 || index > size)
        {
           throw new IndexOutOfBoundsException();
        }
        if (index == 1 || heap[(int)(index/2)] == null)
        {
           throw new NoSuchElementException();
        }
        if (isHeap(heap, size) == false)  
        {
           throw new IllegalArgumentException();
        }
        int x = (int)(index/2);   
        return heap[x];
    }

    //Returns the left-child of the specified element
    public static <T extends Comparable<? super T>> T leftChildOf(int index, T[] heap, int size)
    {
        if (index <= 0 || index > size)
        {
           throw new IndexOutOfBoundsException();
        }
        if ((index*2) > size || heap[index*2] == null)          
        {
           throw new NoSuchElementException();
        }
        if (isHeap(heap, size) == false) 
        {
           throw new IllegalArgumentException();
        }
        return heap[(index*2)];
    }

    //Returns the right-child of the specified element
    public static <T extends Comparable<? super T>> T rightChildOf(int index, T[] heap, int size)
    {
        if (index <= 0 || index > size)
        {
           throw new IndexOutOfBoundsException();
        }
        if (((index*2) + 1) > size || heap[(index*2) + 1] == null)          
        {
           throw new NoSuchElementException();
        }
        if (isHeap(heap, size) == false) 
        {
           throw new IllegalArgumentException();
        }
        return heap[(index*2) + 1];
    }
}
