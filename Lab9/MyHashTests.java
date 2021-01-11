/*
 * My Hash Tests
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

public class MyHashTests
{
    @Test
    public void test_hash()
    {
       Hashable<String> hash = new MyHash();
       assertEquals(105, hash.hash("34"));
       assertEquals(537, hash.hash("hello"));
       assertEquals(731, hash.hash("ramadan"));
       assertEquals(150, hash.hash("300"));
       assertEquals(155, hash.hash("134"));
       assertEquals(53, hash.hash("4"));
       assertEquals(634, hash.hash("coding"));
       assertEquals(379, hash.hash("Saba"));
    }
}

