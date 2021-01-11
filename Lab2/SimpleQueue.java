/*
 * Simple Queue Interface
 *
 * @author Saba Ramadan
 * @version Lab 2
 * @version CPE103-03
 * @version Winter 2017
 */

public interface SimpleQueue<T>
{
    //Removes and returns the element at the front of this queue.
    public T dequeue();

    //Adds the specified element to the end of this queue.
    public void enqueue(T element);

    //Returns the element at the front of this queue (but does not remove it).
    public T peek();

    //Returns the number of elements in this queue.
    public int size();
}
