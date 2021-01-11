/*
 * String Hash
 *  
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

public class StringHash implements Hashable<String>
{
    //empty constructor
    public StringHash()
    {
    }
 
    //Returns a hash code for the specified string
    public int hash(String s)
    {
       return s.hashCode();     
    }
}
