/*
 * Prime Tools Tests
 *
 * @author Saba Ramadan
 * @version Lab 9 
 * @version CPE103-03
 * @version Winter 2017
 */

import static org.junit.Assert.*;
import org.junit.*;
import java.lang.reflect.*;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class PrimeToolsTests
{
    @Test
    public void test_isPrime() 
    {
       assertFalse(PrimeTools.isPrime(1));
       assertTrue(PrimeTools.isPrime(2));
       assertTrue(PrimeTools.isPrime(13));
       assertFalse(PrimeTools.isPrime(40));
       assertTrue(PrimeTools.isPrime(53));
       assertFalse(PrimeTools.isPrime(66));
       assertFalse(PrimeTools.isPrime(-11));
       assertFalse(PrimeTools.isPrime(100));
       assertTrue(PrimeTools.isPrime(29));
       assertFalse(PrimeTools.isPrime(0));
    }

    @Test
    public void test_nextPrime()
    {
       assertEquals(53, PrimeTools.nextPrime(53));
       assertEquals(11, PrimeTools.nextPrime(8));
       assertEquals(3, PrimeTools.nextPrime(3));
       assertEquals(5, PrimeTools.nextPrime(4));
       assertEquals(73, PrimeTools.nextPrime(72));
       assertEquals(7, PrimeTools.nextPrime(6));
    }

    @Test (expected = IllegalArgumentException.class)
    public void test_nextPrimeException()
    {
        PrimeTools.nextPrime(-1);
    }

    @Test
    public void test_nextPrime2()
    {
        assertEquals(Integer.MAX_VALUE, PrimeTools.nextPrime(Integer.MAX_VALUE));
    }
}
