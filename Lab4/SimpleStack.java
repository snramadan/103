/*
 * Simple Stack
 *
 * @author Saba Ramadan
 * @verion Lab 4
 * @version CPE103-03
 * @version Winter 2017
 */

public interface SimpleStack<T>
{
    //Returns the element on the top of this stack (but does not remove it).
    public T peek();

    //Removes and returns the element on the top of this stack.
    public T pop();

    //Adds the specified element to the top of this stack.
    public void push(T element);

    //Returns the number of elements in this stack.
    public int size();
}

