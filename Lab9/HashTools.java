/*
 * Hash Tools
 * 
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

import java.util.*;
import java.lang.*;

public class HashTools
{
    //Determines the number of hash code collisions in the specified case.
    public static <T> int collisions(List<T> list, int tableSize, Hashable<T> hashable)
    {
        int size = PrimeTools.nextPrime(tableSize);
        Boolean[] arr = new Boolean[size];
        Arrays.fill(arr, Boolean.FALSE);
        int collisions = 0;
  
        for (int i = 0; i < list.size(); i++)
        {
            int h = Math.abs(hashable.hash(list.get(i)))%size;
            if (arr[h] == true)
            {
                collisions++;
            }
            else
            {
                arr[h] = true;
            }
        } 
 
        return collisions;      
    }

    //Determines the maximum number of hash code collisions occurring in a single location in the specified case
    public static <T> int maxCollisions(List<T> list, int tableSize, Hashable<T> hashable)
    {
        int size = PrimeTools.nextPrime(tableSize);
        Integer[] arr = new Integer[size];
        Arrays.fill(arr, 0);

        for (int i = 0; i < list.size(); i++)
        {
            int h = Math.abs(hashable.hash(list.get(i)))%size;
            arr[h] += 1;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
           
        return max;
    }

    //Determines the average number of elements that have been hashed to each spot in the hash table, ignoring spots that have no items hashed to them.
    public static <T> double avgChainLength(List<T> list, int tableSize, Hashable<T> hashable)
    {
        int size = PrimeTools.nextPrime(tableSize);
        Integer[] arr = new Integer[size];
        Arrays.fill(arr, 0);
        int hashes = 0;
        int average = 0;
 
        for (int i = 0; i < list.size(); i++)
        {
            int h = Math.abs(hashable.hash(list.get(i)))%size;
            arr[h] += 1;
        }
  
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                hashes = hashes + arr[i];
                average++;      
            }
        }

        double sum = (double)hashes/average;
        return sum;          
    }

    //Determines the number of unused hash table cells that occur in the specified case
    public static <T> int unused(List<T> list, int tableSize, Hashable<T> hashable)
    {
        int size = PrimeTools.nextPrime(tableSize);
        Integer[] arr = new Integer[size];
        Arrays.fill(arr, 0);
        int nohashes = 0;

        for (int i = 0; i < list.size(); i++)
        {
            int h = Math.abs(hashable.hash(list.get(i)))%size;
            arr[h] += 1;
        }

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                nohashes++;
            }
        }
  
        return nohashes;
    }
}
