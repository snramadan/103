/*
 * Better Hash
 *  
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

public class BetterHash implements Hashable<String>
{
    //empty constructor
    public BetterHash()
    {
    }

    //Returns a hash code for the specified string.
    public int hash(String s) 
    {
       int hash = 0;
       int len = s.length();

       for (int i = 0; i < len; i++) 
       {
          // There are 95 displayable ASCII characters, 97 is the next prime...
          hash = hash * 97 + s.charAt(i);
       }
       return hash;
    }
}
