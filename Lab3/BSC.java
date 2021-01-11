/*
 * Balanced Symbol Checker
 *  
 * @author Saba Ramadan
 * @verion Lab 3
 * @version CPE103-03
 * @version Winter 2017
 */

import java.util.*;
import java.lang.*;

public class BSC
{
    public static boolean isBalanced(String s)
    {
        //creates stack
        SimpleArrayStack<Character> list = new SimpleArrayStack<Character>();

        //if both the string and stack are empty then it is balanced
        if (s.length() == 0 && list.size() == 0)
        {
            return true;
        }
       
        //try catch block 
        try
        {
            //for loop to go through the string
            for (int i = 0; i < s.length(); i++)
            {
                 //separates the string to chars 
                 char temp = s.charAt(i);
                 //checks if the first type is a opener
                 if (temp == '[' || temp == '{' || temp == '(' || temp == '<')
                 {
                     //pushes it to list
                     list.push(temp);
                 }
                 //checks if closing bracket matches opeing bracket 
                 if (temp == ']')
                 {
                     if (!list.pop().equals('['))
                     {
                         return false;
                     }
                 }
                 else if (temp == '}')
                 {
                     if (!list.pop().equals('{'))
                     {
                         return false;
                     }
                 }
                 else if (temp == ')')
                 {
                     if (!list.pop().equals('('))
                     {
                         return false;
                     }
                 }
                 else if (temp == '>')
                 {
                     if (!list.pop().equals('<'))
                     {
                         return false;
                     }
                 }
            }
        }
    
        catch (NoSuchElementException e)
        {
            return false;
        }
   
        //if size not equal to zero the list cant be balanced
        if (list.size() != 0)
        {
            return false;
        }

        //otherwise true
        return true;
    }
}
