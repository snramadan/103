/*
 * String Hash Tests
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

public class StringHashTests
{
    @Test 
    public void test_hash()
    {
       Hashable<String> hash = new StringHash();
       assertEquals(1633, hash.hash("34")); 
       assertEquals(99162322, hash.hash("hello"));  
       assertEquals(976884910, hash.hash("ramadan"));
       assertEquals(50547, hash.hash("300"));
       assertEquals(48722, hash.hash("134"));
       assertEquals(52, hash.hash("4"));
       assertEquals(-1355086998, hash.hash("coding"));
       assertEquals(2569005, hash.hash("Saba"));
    }
}
