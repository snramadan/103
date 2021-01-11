/*
 * Priority Queue 
 *
 * @author Saba Ramadan
 * @version Project 3
 * @version CPE103-03
 * @version Winter 2017
 */

import java.util.*;
import java.lang.*;

public class PriorityQueue<T extends Comparable<? super T>> implements SimpleQueue<T>
{
    private ArrayList<T> list;
    //keeps track if queue is minimum or maximum, false if min, true if max
    private boolean que;

    //Creates a minimum PriorityQueue
    public PriorityQueue()
    {
        this.que = false;
        list = new ArrayList<T>();
        list.add(null);
    }

    //Creates a minimum or max PriorityQueue
    public PriorityQueue(boolean isMax)
    {
        this.que = isMax;
        list = new ArrayList<T>();
        list.add(null);
    }
   
    //Creates a minimum or max PriorityQueue and enqueues it that way
    public PriorityQueue(T[] arr, int size)
    {
        this.que = false;
        list = new ArrayList<T>();
        list.add(null);
        for (int i = 0; i < size; i++)
        {
            this.enqueue(arr[i]);
        }
    }

    //Creates a minimum or max PriorityQueue and enqueues it that way
    public PriorityQueue(T[] arr, int size, boolean isMax)
    {
        this.que = isMax;
        list = new ArrayList<T>();
        list.add(null);
        for (int i = 0; i < size; i++)
        {
            this.enqueue(arr[i]);
        }
    }

    //takes out of queue 
    public T dequeue()
    {
        if (this.size() <= 0)
        {
           throw new NoSuchElementException();
        }
        //save root to return at end
        T root = list.get(1);
        //remove last child
        T last = list.remove(this.size());
        int i = 1;
        boolean done = false;

        //if size is zero do do anything just return the root
        if (this.size() == 0)
        {
            return root;
        }
        //if size is one then the value automatically becomes root no matter min or max
        if (this.size() == 1)
        {
            list.set(i, last);
            return root;
        } 
        //checks min
        if (que == false)
        {
            while ((i*2 <= this.size()) && done == false)
            {
                if (i*2 == this.size())
                {
                    if (last.compareTo(list.get(i*2)) >= 0)
                    {
                       list.set(i, list.get(i*2));
                       list.set(i*2, last);
                       done = true; 
                    }
                    else
                    {
                       list.set(i, last);
                       done = true;
                    }
                }
                else if (last.compareTo(list.get(i*2)) <= 0 && last.compareTo(list.get((i*2)+1)) <= 0)
                {
                    list.set(i, last);
                    done = true;
                }
                else
                {
                    if (list.get((i*2)+1).compareTo(list.get(i*2)) >= 0)
                    {
                        list.set(i, list.get(i*2));
                        list.set(i*2, last);
                        i = i*2;
                    }
                    else
                    {
                        list.set(i, list.get((i*2)+1));
                        list.set((i*2)+1, last);
                        i = (i*2)+1;
                    }
                }
            }
            //list.set(i, last);
        }
        //checks max
        else
        {
            while ((i*2 <= this.size()) && done == false)
            {
                if (i*2 == this.size())
                {
	            if (last.compareTo(list.get(i*2)) <= 0)
                    {
                       list.set(i, list.get(i*2));
                       list.set(i*2, last);
                       done = true;
                    }
                    else
                    {
                       list.set(i, last);
                       done = true;
                    }
                }
                else if (last.compareTo(list.get(i*2)) >= 0 && last.compareTo(list.get((i*2)+1)) >= 0)
                {
                    list.set(i, last);
                    done = true;
                }
                else
                {
                    if (list.get((i*2)+1).compareTo(list.get(i*2)) <= 0)
                    {
                        list.set(i, list.get(i*2));
                        list.set(i*2, last);
                        i = i*2;
                    }
                    else
                    {
                        list.set(i, list.get((i*2)+1));
                        list.set((i*2)+1, last);
                        i = (i*2)+1;
                    }
                }
            }
            //list.set(i, last);
        }
        //returns initial root value
        return root;
    }

    //adds into Queue
    public void enqueue(T element)
    {
        int i = this.size()+1;
        boolean done = false;        
        list.add(element);

        //if empty list add 
        if (que == false)
        {
            while (i/2 >= 1 && done == false)
            {   
                if (element.compareTo(list.get(i/2)) >= 0)
                {   
                    list.set(i, element);
                    done = true;
                }
                else
                {   
                    list.set(i, list.get(i/2));
                    list.set(i/2, element);
                    i = i/2;
                }
            }
        }
        else
        {
            while (i/2 >= 1 && done == false)
            {
                if (element.compareTo(list.get(i/2)) <= 0)
                {   
                    list.set(i, element);
                    done = true;
                }
                else
                {
                    list.set(i, list.get(i/2));
                    list.set(i/2, element);
                    i = i/2;
                }
            }
        }
    }
 
    //gets the front of queue 
    public T peek()
    {
        if (list.size() <= 1)
        {
           throw new NoSuchElementException();
        }
        return list.get(1);
    }
  
    //returns size
    public int size()
    {
        if (list.size() <= 1)
        {
           return 0;
        }
        return list.size()-1;
    }
    
    //sorts array into ascending order
    public static <E extends Comparable<? super E>> void sort(E[] arr, int size)
    {
        PriorityQueue<E> t = new PriorityQueue<E>(arr, size);
           
        for (int j = 0; j < size; j++) 
        {
            arr[j] = t.dequeue();
        }
    }
   
    //returns kth largest value
    public static <E extends Comparable<? super E>> E kth(E[] arr, int size, int k)
    {
        if (k <= (size-k) + 1)
        {
            PriorityQueue<E> mi = new PriorityQueue<E>(arr, k);
            for (int j = k; j < size; j++)
            {
                 if (arr[j].compareTo(mi.peek()) > 0)
                 {
                     mi.dequeue();
                     mi.enqueue(arr[j]);
                 }
            }
            return mi.peek();           
        }
        else
        {
            PriorityQueue<E> ma = new PriorityQueue<E>(arr, (size-k)+1, true);
            for (int j = (size-k)+1; j < size; j++)
            {
                 if (arr[j].compareTo(ma.peek()) < 0)
                 {
                     ma.dequeue();
                     ma.enqueue(arr[j]);
                 }
            }
            return ma.peek();
        }     
    }
}
