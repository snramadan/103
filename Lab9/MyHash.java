/*
 * My Hash
 *
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

public class MyHash implements Hashable<String>
{
    //empty constructor
    public MyHash()
    {
    }

    //Returns a hash code for the specified string
    public int hash(String s)
    {
       int hash = 0;
       int len = s.length();

       for (int i = 0; i < len; i++) 
       {
          hash = hash + 1 + s.charAt(i);
       }
       return hash;
    }
}
