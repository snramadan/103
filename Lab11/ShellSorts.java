/*
 * Shell Sorts
 *
 * @author Saba Ramadan
 */

import java.util.*;

public class ShellSorts 
{
    public ShellSorts()
    {
    }

    public static <E extends Comparable<? super E>> void shell(E[] a)
    {
       int[] gaps = new int[] {8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};

       for (int gap : gaps)
       {   
           
           for (int i = gap; i < a.length; i++)
           {
               E temp = a[i];
               int j;
               for (j = i; j >= gap && a[j-gap].compareTo(temp) > 0; j = j-gap)
               {
                   a[j] = a[j-gap];
               }
               a[j] = temp;
           }
       }
    }

    public static <E extends Comparable<? super E>> void hibbard(E[] a)
    {
       int[] gaps = new int[] {8191, 4095, 2047, 1023, 511, 255, 127, 63, 31, 15, 7, 3, 1};

       for (int gap : gaps)
       {

           for (int i = gap; i < a.length; i++)
           {
               E temp = a[i];
               int j;
               for (j = i; j >= gap && a[j-gap].compareTo(temp) > 0; j = j-gap)
               {
                   a[j] = a[j-gap];
               }
               a[j] = temp;
           }
       }
    }

    public static <E extends Comparable<? super E>> void sedgewick(E[] a)
    {
       int[] gaps = new int[] {4197377, 1050113, 262913, 65921, 16577, 4193, 1073, 281, 77, 23, 8, 1};
       
       for (int gap : gaps)
       {
           for (int i = gap; i < a.length; i++)
           {
               E temp = a[i];
               int j;
               for (j = i; j >= gap && a[j-gap].compareTo(temp) > 0; j = j-gap)
               {
                   a[j] = a[j-gap];
               }
               a[j] = temp;
           }
       }
    }

    public static <E extends Comparable<? super E>> void heapSort(E[] a)
    {
         PriorityQueue.sort(a, a.length);
    }
}
