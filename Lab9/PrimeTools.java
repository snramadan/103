/*
 * Prime Tools
 *
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

import java.lang.*;
import java.util.*;

public class PrimeTools
{
    //Determines if the given number is a positive prime
    public static boolean isPrime(int value)
    {
        if (value <= 0 || value == 1)
        {
            return false;
        }
        for (int i = 2; i < value; i++)
        {
            if (value%i == 0)
            {
                return false;
            }
        }
        return true;  
    }

    //Finds and returns the first prime number greater than or equal to the specified value.
    public static int nextPrime(int value)
    {
        if (value < 0)
        {
            throw new IllegalArgumentException();
        }
        while (!isPrime(value))
        {
           value++;
        }
        return value;
    }
} 
