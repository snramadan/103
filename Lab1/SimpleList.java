/*
 * Simple List Interface
 *
 * @author Saba Ramadan 
 * @version Lab 1
 * @version CPE103-03
 * @version Winter 2017
 */

public interface SimpleList<T>
{
    //Appends the specified element to the end of this list. 
    //Allows null elements to be added to this list.
    public void add(T element);

    //Inserts the specified element at the specified position in this list.
    //Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
    public void add(int index, T element);

    //Returns the element at the specified position in this list.
    public T get(int index);

    //Removes the element at the specified position in this list.
    //Shifts any subsequent elements to the left (subtracts one from their indices).
    public T remove(int index);

    //Returns the number of elements in this list (elements that have been added by the creator/user of this list).
    public int size();
}
