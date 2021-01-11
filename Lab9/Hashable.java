/*
 * Hashable
 *
 * @author Saba Ramadan
 * @version Lab 9
 * @version CPE103-03
 * @version Winter 2017
 */

public interface Hashable<T>
{
    //Returns a hash code value for the specified object.
    int hash(T input);
}
