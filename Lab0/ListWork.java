/*
 * Lab 0
 *
 * @author Saba Ramadan
 * @version Lab 0
 * @versin CPE 103-03
 * @version Winter 2017
 */

import java.lang.Object;
import java.util.Scanner;

public class ListWork
{
    //Returns true if the given array contains the specified element. 
    public static <T> boolean search(T[] arr, T target)
    {
        for (int i = 0; i < arr.length; i++)
	{
            if (arr[i] == null && target == null)
	    {
                return true;
            }
            if (arr[i] == null)
            {
                return false;
            }
            if ((arr[i]).equals(target))
            {
                return true;
            }
        }
	return false;
    }

    //Prints all elements of the given array, one element per line
    public static <T> void print(T[] arr)
    {
	for (int i = 0; i < arr.length; i++)
        {
	     System.out.println(arr[i]);
        }
    }
 
    //Creates a list and tests if the search and print methods are working correctly
    public static void main(String[] args)
    {
	Integer[] intlist = new Integer[10];
	Scanner scan = new Scanner(System.in);
    
	while (intlist[9] == null)
        {
            for (int i = 0; i < intlist.length; i++)
            {
                 intlist[i] = scan.nextInt();
            }
        }
   
        while(true)
        {
            String s = scan.next();
            try
            {
                int t = Integer.parseInt(s);
                search(intlist, t);
            }
            catch (Exception e)
            {
                System.out.println("Error: not integer");
                break;
            }
        }        
  
        print(intlist);
    }
}
