/*
 * Separator 
 *
 * @author Saba Ramadan
 * @version Lab 0
 * @version CPE103-03
 * @version Winter 2017
 */

import java.lang.Object;
import java.util.Arrays;
import java.util.Scanner;

public class Separator
{
    public static void main(String args[])
    {
        //creating variable N and setting it to six
        int N = 6;
        //setting up scanner
        Scanner scan = new Scanner(System.in);
        //setting up 2 arrays to put the inputs in 
        Float[] flo = new Float[N];
        Integer[] inte = new Integer[N];
        //variables that will keep track of indexs of arrays and how many things are in the lists
        int index = 0;
        int index2 = 0; 

        //loop that takes in the inputs
        //checks if has next value and whether the inputs are less than N  
        while(scan.hasNext() && (index < N || index2 < N))
        {
            //checks if an integer is inputed then checks if index is in bounds
            //inputs input into array
            if (scan.hasNextInt())
            {
                if (index >= N)
                { 
                    break;
                }
                inte[index] = scan.nextInt();
                index++;
            }
 
            //checks if an float is inputed then checks if index is in bounds
            //inputs input into array
            else if (scan.hasNextFloat())
            {
                if (index2 >= N)
                {
                    break;
                }
                flo[index2] = scan.nextFloat();
                index2++;
            }
   
            else
            {
                break;
            }
        }   
        
        //prints lists 
        System.out.print("\nIntegers: ");
        for (int i = 0; i < index; i++)
        {
            System.out.print(inte[i] + " ");
        }
  
        System.out.print("\nFloats: ");
        for (int y = 0; y < index2; y++)
        {
           System.out.print(flo[y] + " ");
        }
    }
}
