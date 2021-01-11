/*
 * Shell Sorts Tests
 *
 * @author Saba Ramadan
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

public class ShellSortsTests
{
     @Test
     public void test_Shell()
     {
         Integer[] list = new Integer[] {22, 55, 88, 77, 99, 1};
         ShellSorts.shell(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(22));
         assertEquals(list[2], new Integer(55));
         assertEquals(list[3], new Integer(77));
         assertEquals(list[4], new Integer(88));
         assertEquals(list[5], new Integer(99));
     }

     @Test
     public void test_Hibbard()
     {
         Integer[] list = new Integer[] {22, 55, 88, 77, 99, 1};
         ShellSorts.hibbard(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(22));
         assertEquals(list[2], new Integer(55));
         assertEquals(list[3], new Integer(77));
         assertEquals(list[4], new Integer(88));
         assertEquals(list[5], new Integer(99));
     }

     @Test
     public void test_Sedgewick()
     {
         Integer[] list = new Integer[] {22, 55, 88, 77, 99, 1};
         ShellSorts.sedgewick(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(22));
         assertEquals(list[2], new Integer(55));
         assertEquals(list[3], new Integer(77));
         assertEquals(list[4], new Integer(88));
         assertEquals(list[5], new Integer(99));
     }

     @Test
     public void test_HeapSort()
     {
         Integer[] list = new Integer[] {22, 55, 88, 77, 99, 1};
         ShellSorts.heapSort(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(22));
         assertEquals(list[2], new Integer(55));
         assertEquals(list[3], new Integer(77));
         assertEquals(list[4], new Integer(88));
         assertEquals(list[5], new Integer(99));
     }
  
     @Test
     public void test_Shell2()
     {   
         Integer[] list = new Integer[] {2, 6, 887, 73, 1, 46, 78, 300};
         ShellSorts.shell(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(2));
         assertEquals(list[2], new Integer(6));
         assertEquals(list[3], new Integer(46));
         assertEquals(list[4], new Integer(73));
         assertEquals(list[5], new Integer(78));
         assertEquals(list[6], new Integer(300));
         assertEquals(list[7], new Integer(887));
         
     }

     @Test
     public void test_Hibbard2()
     {   
         Integer[] list = new Integer[] {2, 6, 887, 73, 1, 46, 78, 300};
         ShellSorts.hibbard(list); 
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(2));
         assertEquals(list[2], new Integer(6));
         assertEquals(list[3], new Integer(46));
         assertEquals(list[4], new Integer(73));
         assertEquals(list[5], new Integer(78));
         assertEquals(list[6], new Integer(300));
         assertEquals(list[7], new Integer(887));
     }

     @Test
     public void test_Sedgewick2()
     {   
         Integer[] list = new Integer[] {2, 6, 887, 73, 1, 46, 78, 300};
         ShellSorts.sedgewick(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(2));
         assertEquals(list[2], new Integer(6));
         assertEquals(list[3], new Integer(46));
         assertEquals(list[4], new Integer(73));
         assertEquals(list[5], new Integer(78));
         assertEquals(list[6], new Integer(300));
         assertEquals(list[7], new Integer(887));
     }

     @Test
     public void test_HeapSort2()
     {
         Integer[] list = new Integer[] {2, 6, 887, 73, 1, 46, 78, 300};   
         ShellSorts.heapSort(list);
         assertEquals(list[0], new Integer(1));
         assertEquals(list[1], new Integer(2));
         assertEquals(list[2], new Integer(6));
         assertEquals(list[3], new Integer(46));
         assertEquals(list[4], new Integer(73));
         assertEquals(list[5], new Integer(78));
         assertEquals(list[6], new Integer(300));
         assertEquals(list[7], new Integer(887));
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
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("Shell 2500 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr2500, arr2500.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 2500 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr2500, arr2500.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 2500 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr2500, arr2500.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 2500 Sort Time4: " + (after4 - before4));
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
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("Shell 5000 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr5000, arr5000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 5000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr5000, arr5000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 5000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr5000, arr5000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 5000 Sort Time4: " + (after4 - before4));
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
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("Shell 10000 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr10000, arr10000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("Hibard 10000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr10000, arr10000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("Sedgewick 10000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr10000, arr10000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 10000 Sort Time4: " + (after4 - before4));
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
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("shell 20000 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr20000, arr20000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 20000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr20000, arr20000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 20000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr20000, arr20000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 20000 Sort Time4: " + (after4 - before4));
     }

     @Test
     public void test_500000Sorts()
     {
        Random rand = new Random();
        Integer[] arr500000 = new Integer[500000];

        for (int i = 0; i <500000; i++)
        {
           arr500000[i] = rand.nextInt();
        }

        Integer[] copy = Arrays.copyOf(arr500000, arr500000.length);
        long before = System.currentTimeMillis();
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("shell 500000 Sort Time: " + (after - before));
 
        Integer[] copy2 = Arrays.copyOf(arr500000, arr500000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 500000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr500000, arr500000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 500000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr500000, arr500000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 500000 Sort Time4: " + (after4 - before4));
     }

     @Test
     public void test_1000000Sorts()
     {
        Random rand = new Random();
        Integer[] arr1000000 = new Integer[1000000];

        for (int i = 0; i <1000000; i++)
        {
           arr1000000[i] = rand.nextInt();
        }

        Integer[] copy = Arrays.copyOf(arr1000000, arr1000000.length);
        long before = System.currentTimeMillis();
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("Shell 1000000 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr1000000, arr1000000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 1000000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr1000000, arr1000000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 1000000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr1000000, arr1000000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 1000000 Sort Time4: " + (after4 - before4));
     }

     @Test
     public void test_2000000Sorts()
     {
        Random rand = new Random();
        Integer[] arr2000000 = new Integer[2000000];

        for (int i = 0; i <2000000; i++)
        {
           arr2000000[i] = rand.nextInt();
        }

        Integer[] copy = Arrays.copyOf(arr2000000, arr2000000.length);
        long before = System.currentTimeMillis();
        ShellSorts.shell(copy);
        long after = System.currentTimeMillis();
        System.out.println("Shell 2000000 Sort Time: " + (after - before));

        Integer[] copy2 = Arrays.copyOf(arr2000000, arr2000000.length);
        long before2 = System.currentTimeMillis();
        ShellSorts.hibbard(copy2);
        long after2 = System.currentTimeMillis();
        System.out.println("hibbard 2000000 Sort Time2: " + (after2 - before2));

        Integer[] copy3 = Arrays.copyOf(arr2000000, arr2000000.length);
        long before3 = System.currentTimeMillis();
        ShellSorts.sedgewick(copy3);
        long after3 = System.currentTimeMillis();
        System.out.println("sedgewick 2000000 Sort Time3: " + (after3 - before3));

        Integer[] copy4 = Arrays.copyOf(arr2000000, arr2000000.length);
        long before4 = System.currentTimeMillis();
        ShellSorts.heapSort(copy4);
        long after4 = System.currentTimeMillis();
        System.out.println("heapSort 2000000 Sort Time4: " + (after4 - before4));
     }*/
}
