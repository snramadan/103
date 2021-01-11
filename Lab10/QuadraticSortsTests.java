/*
 * Quadratic Sort Tests
 *
 * @author Saba Ramadan
 * @version Lab 10
 * @version CPE103-03
 * @version Winter 2017
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import java.util.Random;
import java.util.Arrays;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;

public class QuadraticSortsTests 
{
    @Test
    public void test_bubblesort1()
    {
        Integer[] array = new Integer[] {10, 20, 12, 15, 5, 16, 25, 30};
        QuadraticSorts.bubbleSort1(array);

        assertEquals(array[0], new Integer(5));
        assertEquals(array[1], new Integer(10));
        assertEquals(array[2], new Integer(12));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(16));
        assertEquals(array[5], new Integer(20));
        assertEquals(array[6], new Integer(25));
        assertEquals(array[7], new Integer(30));
    }
 
    @Test
    public void test_bubblesort2()
    {
        Integer[] array = new Integer[] {10, 20, 12, 15, 5, 16, 25, 30};
        QuadraticSorts.bubbleSort2(array);

        assertEquals(array[0], new Integer(5));
        assertEquals(array[1], new Integer(10));
        assertEquals(array[2], new Integer(12));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(16));
        assertEquals(array[5], new Integer(20));
        assertEquals(array[6], new Integer(25));
        assertEquals(array[7], new Integer(30));
    }
 
    @Test
    public void test_selection()
    {
        Integer[] array = new Integer[] {10, 20, 12, 15, 5, 16, 25, 30};
        QuadraticSorts.selectionSort(array);

        assertEquals(array[0], new Integer(5));
        assertEquals(array[1], new Integer(10));
        assertEquals(array[2], new Integer(12));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(16));
        assertEquals(array[5], new Integer(20));
        assertEquals(array[6], new Integer(25));
        assertEquals(array[7], new Integer(30));
    }

    @Test
    public void test_insertion()
    {
        Integer[] array = new Integer[] {10, 20, 12, 15, 5, 16, 25, 30};
        QuadraticSorts.insertionSort(array);

        assertEquals(array[0], new Integer(5));
        assertEquals(array[1], new Integer(10));
        assertEquals(array[2], new Integer(12));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(16));
        assertEquals(array[5], new Integer(20));
        assertEquals(array[6], new Integer(25));
        assertEquals(array[7], new Integer(30));
    }

    @Test
    public void test2_bubblesort1()
    {   
        Integer[] array = new Integer[] {14, 200, 1, 15, 67, 0};
        QuadraticSorts.bubbleSort1(array);
        
        assertEquals(array[0], new Integer(0));
        assertEquals(array[1], new Integer(1));
        assertEquals(array[2], new Integer(14));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(67));
        assertEquals(array[5], new Integer(200));
    }
    
    @Test
    public void test2_bubblesort2()
    {
        Integer[] array = new Integer[] {14, 200, 1, 15, 67, 0};   
        QuadraticSorts.bubbleSort2(array);
     
        assertEquals(array[0], new Integer(0));
        assertEquals(array[1], new Integer(1));
        assertEquals(array[2], new Integer(14));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(67));
        assertEquals(array[5], new Integer(200));
    }
    
    @Test
    public void test2_selection()
    {   
        Integer[] array = new Integer[] {14, 200, 1, 15, 67, 0};
        QuadraticSorts.selectionSort(array);
     
        assertEquals(array[0], new Integer(0));
        assertEquals(array[1], new Integer(1));
        assertEquals(array[2], new Integer(14));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(67));
        assertEquals(array[5], new Integer(200));   
    }
    
    @Test
    public void test2_insertion()
    {
        Integer[] array = new Integer[] {14, 200, 1, 15, 67, 0};   
        QuadraticSorts.insertionSort(array);
     
        assertEquals(array[0], new Integer(0));
        assertEquals(array[1], new Integer(1));
        assertEquals(array[2], new Integer(14));
        assertEquals(array[3], new Integer(15));
        assertEquals(array[4], new Integer(67));
        assertEquals(array[5], new Integer(200));   
    }

    @Test
    public void test3_bubblesort1()
    {
        Integer[] array = new Integer[] {34, 65, 87, 94, 35, 102, 78, 69, 400};
        QuadraticSorts.bubbleSort1(array);

        assertEquals(array[0], new Integer(34));
        assertEquals(array[1], new Integer(35));
        assertEquals(array[2], new Integer(65));
        assertEquals(array[3], new Integer(69));
        assertEquals(array[4], new Integer(78));
        assertEquals(array[5], new Integer(87));
        assertEquals(array[6], new Integer(94));
        assertEquals(array[7], new Integer(102));
        assertEquals(array[8], new Integer(400));
    }

    @Test
    public void test3_bubblesort2()
    {
        Integer[] array = new Integer[] {34, 65, 87, 94, 35, 102, 78, 69, 400};
        QuadraticSorts.bubbleSort2(array);

        assertEquals(array[0], new Integer(34));
        assertEquals(array[1], new Integer(35));
        assertEquals(array[2], new Integer(65));
        assertEquals(array[3], new Integer(69));
        assertEquals(array[4], new Integer(78));
        assertEquals(array[5], new Integer(87));
        assertEquals(array[6], new Integer(94));
        assertEquals(array[7], new Integer(102));
        assertEquals(array[8], new Integer(400));
    }

    @Test
    public void test3_selection()
    {
        Integer[] array = new Integer[] {34, 65, 87, 94, 35, 102, 78, 69, 400};
        QuadraticSorts.selectionSort(array);

        assertEquals(array[0], new Integer(34));
        assertEquals(array[1], new Integer(35));
        assertEquals(array[2], new Integer(65));
        assertEquals(array[3], new Integer(69));
        assertEquals(array[4], new Integer(78));
        assertEquals(array[5], new Integer(87));
        assertEquals(array[6], new Integer(94));
        assertEquals(array[7], new Integer(102));
        assertEquals(array[8], new Integer(400));
    }

    @Test
    public void test3_insertion()
    {
        Integer[] array = new Integer[] {34, 65, 87, 94, 35, 102, 78, 69, 400};
        QuadraticSorts.insertionSort(array);

        assertEquals(array[0], new Integer(34));
        assertEquals(array[1], new Integer(35));
        assertEquals(array[2], new Integer(65));
        assertEquals(array[3], new Integer(69));
        assertEquals(array[4], new Integer(78));
        assertEquals(array[5], new Integer(87));
        assertEquals(array[6], new Integer(94));
        assertEquals(array[7], new Integer(102));
        assertEquals(array[8], new Integer(400));
    }

    /*@Test
    public void test_2500Sorts()
    {
       Random rand = new Random();
       Integer[] arr2500 = new Integer[2500];

       for (int i = 0; i <2500; i++)
       {
           arr2500[i] = rand.nextInt();
       }

       Integer[] copy = Arrays.copyOf(arr2500, arr2500.length);
       long before = System.currentTimeMillis();
       QuadraticSorts.bubbleSort1(copy);
       long after = System.currentTimeMillis();
       System.out.println("Bubble 1 2500 Sort Time: " + (after - before));

       Integer[] copy2 = Arrays.copyOf(arr2500, arr2500.length);
       long before2 = System.currentTimeMillis();
       QuadraticSorts.bubbleSort2(copy2);
       long after2 = System.currentTimeMillis();
       System.out.println("Bubble 2 2500 Sort Time2: " + (after2 - before2));

       Integer[] copy3 = Arrays.copyOf(arr2500, arr2500.length);
       long before3 = System.currentTimeMillis();
       QuadraticSorts.insertionSort(copy3);
       long after3 = System.currentTimeMillis();
       System.out.println("Insertion 2500 Sort Time3: " + (after3 - before3));

       Integer[] copy4 = Arrays.copyOf(arr2500, arr2500.length);
       long before4 = System.currentTimeMillis();
       QuadraticSorts.selectionSort(copy4);
       long after4 = System.currentTimeMillis();
       System.out.println("Selection 2500 Sort Time4: " + (after4 - before4));
    }
 
    @Test
    public void test_5000Sorts()
    {
       Random rand = new Random();
       Integer[] arr5000 = new Integer[5000];

       for (int i = 0; i <5000; i++)
       {
           arr5000[i] = rand.nextInt();
       }

       Integer[] copy = Arrays.copyOf(arr5000, arr5000.length);
       long before = System.currentTimeMillis();
       QuadraticSorts.bubbleSort1(copy);
       long after = System.currentTimeMillis();
       System.out.println("Bubble 1 5000 Sort Time: " + (after - before));

       Integer[] copy2 = Arrays.copyOf(arr5000, arr5000.length);
       long before2 = System.currentTimeMillis();
       QuadraticSorts.bubbleSort2(copy2);
       long after2 = System.currentTimeMillis();
       System.out.println("Bubble 2 5000 Sort Time2: " + (after2 - before2));

       Integer[] copy3 = Arrays.copyOf(arr5000, arr5000.length);
       long before3 = System.currentTimeMillis();
       QuadraticSorts.insertionSort(copy3);
       long after3 = System.currentTimeMillis();
       System.out.println("Insertion 5000 Sort Time3: " + (after3 - before3));

       Integer[] copy4 = Arrays.copyOf(arr5000, arr5000.length);
       long before4 = System.currentTimeMillis();
       QuadraticSorts.selectionSort(copy4);
       long after4 = System.currentTimeMillis();
       System.out.println("Selection 5000 Sort Time4: " + (after4 - before4));
    }

    @Test
    public void test_10000Sorts()
    {
       Random rand = new Random();
       Integer[] arr10000 = new Integer[10000];

       for (int i = 0; i <10000; i++)
       {
           arr10000[i] = rand.nextInt();
       }

       Integer[] copy = Arrays.copyOf(arr10000, arr10000.length);
       long before = System.currentTimeMillis();
       QuadraticSorts.bubbleSort1(copy);
       long after = System.currentTimeMillis();
       System.out.println("Bubble 1 10000 Sort Time: " + (after - before));

       Integer[] copy2 = Arrays.copyOf(arr10000, arr10000.length);
       long before2 = System.currentTimeMillis();
       QuadraticSorts.bubbleSort2(copy2);
       long after2 = System.currentTimeMillis();
       System.out.println("Bubble 2 10000 Sort Time2: " + (after2 - before2));

       Integer[] copy3 = Arrays.copyOf(arr10000, arr10000.length);
       long before3 = System.currentTimeMillis();
       QuadraticSorts.insertionSort(copy3);
       long after3 = System.currentTimeMillis();
       System.out.println("Insertion 10000 Sort Time3: " + (after3 - before3));

       Integer[] copy4 = Arrays.copyOf(arr10000, arr10000.length);
       long before4 = System.currentTimeMillis();
       QuadraticSorts.selectionSort(copy4);
       long after4 = System.currentTimeMillis();
       System.out.println("Selection 10000 Sort Time4: " + (after4 - before4));
    }

    @Test
    public void test_20000Sorts()
    {
       Random rand = new Random();
       Integer[] arr20000 = new Integer[20000];

       for (int i = 0; i <20000; i++)
       {
           arr20000[i] = rand.nextInt();
       }

       Integer[] copy = Arrays.copyOf(arr20000, arr20000.length);
       long before = System.currentTimeMillis();
       QuadraticSorts.bubbleSort1(copy);
       long after = System.currentTimeMillis();
       System.out.println("Bubble 1 20000 Sort Time: " + (after - before));

       Integer[] copy2 = Arrays.copyOf(arr20000, arr20000.length);
       long before2 = System.currentTimeMillis();
       QuadraticSorts.bubbleSort2(copy2);
       long after2 = System.currentTimeMillis();
       System.out.println("Bubble 2 20000 Sort Time2: " + (after2 - before2));

       Integer[] copy3 = Arrays.copyOf(arr20000, arr20000.length);
       long before3 = System.currentTimeMillis();
       QuadraticSorts.insertionSort(copy3);
       long after3 = System.currentTimeMillis();
       System.out.println("Insertion 20000 Sort Time3: " + (after3 - before3));

       Integer[] copy4 = Arrays.copyOf(arr20000, arr20000.length);
       long before4 = System.currentTimeMillis();
       QuadraticSorts.selectionSort(copy4);
       long after4 = System.currentTimeMillis();
       System.out.println("Selection 20000 Sort Time4: " + (after4 - before4));
    } 

    @Test
    public void test_40000Sorts()
    {
       Random rand = new Random();
       Integer[] arr40000 = new Integer[40000];

       for (int i = 0; i <40000; i++)
       {
           arr40000[i] = rand.nextInt();
       }

       Integer[] copy = Arrays.copyOf(arr40000, arr40000.length);
       long before = System.currentTimeMillis();
       QuadraticSorts.bubbleSort1(copy);
       long after = System.currentTimeMillis();
       System.out.println("Bubble 1 40000 Sort Time: " + (after - before));

       Integer[] copy2 = Arrays.copyOf(arr40000, arr40000.length);
       long before2 = System.currentTimeMillis();
       QuadraticSorts.bubbleSort2(copy2);
       long after2 = System.currentTimeMillis();
       System.out.println("Bubble 2 40000 Sort Time2: " + (after2 - before2));

       Integer[] copy3 = Arrays.copyOf(arr40000, arr40000.length);
       long before3 = System.currentTimeMillis();
       QuadraticSorts.insertionSort(copy3);
       long after3 = System.currentTimeMillis();
       System.out.println("Insertion 40000 Sort Time3: " + (after3 - before3));

       Integer[] copy4 = Arrays.copyOf(arr40000, arr40000.length);
       long before4 = System.currentTimeMillis();
       QuadraticSorts.selectionSort(copy4);
       long after4 = System.currentTimeMillis();
       System.out.println("Selection 40000 Sort Time4: " + (after4 - before4));
    }*/
}
