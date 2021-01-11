/*
 * Quadratic Sorts
 *
 * @author Saba Ramadan
 * @version Lab 10
 * @version CPE103-03
 * @version Winter 2017
 */

public class QuadraticSorts
{
    public static <T extends Comparable<? super T>> void bubbleSort1(T[] array)
    {  
        int n = array.length;
        boolean swapped = true;
        T temp;
        while (swapped)
        {
           swapped = false;
           for (int i = 1; i < n; i++)
           {
              if (array[i].compareTo(array[i-1]) < 0) 
              {
                 temp = array[i];
                 array[i] = array[i-1];
                 array[i-1] = temp;
                 swapped = true;
              }
           }
        }       
    }

    public static <T extends Comparable<? super T>> void bubbleSort2(T[] array)
    {
        int n = array.length;
        boolean swapped = true;
        T temp;
        while (swapped)
        {
           swapped = false;
           for (int i = 1; i < n; i++)
           {
              if (array[i].compareTo(array[i-1]) < 0)
              {
                 temp = array[i];
                 array[i] = array[i-1];
                 array[i-1] = temp;
                 swapped = true;
              }
           }
           n = n-1;
        }
    }

    //Sorts the specified array into ascending order using selection sort.
    public static <T extends Comparable<? super T>> void selectionSort(T[] array)
    {
        T temp;
        for (int i = 0; i < array.length-1; i++)
        {
            int hold = i;
            for (int j = i+1; j < array.length; j++)
            {  
                if (array[j].compareTo(array[hold]) < 0)
                {
                   hold = j;
                }
            }
            temp = array[hold];
            array[hold] = array[i];
            array[i] = temp;
        }
    }

    //Sorts the specified array into ascending order using insertion sort.
    public static <T extends Comparable<? super T>> void insertionSort(T[] array)
    {
        T temp;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (array[j].compareTo(array[j-1]) < 0)
                {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }
}
