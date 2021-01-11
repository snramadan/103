/*
 * Hash Tools Tests
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

public class HashToolsTests
{
    static ArrayList<String> lst;

    @BeforeClass
    public static void oneTimeSetUp() throws IOException, FileNotFoundException
    {
       ArrayList<String> tmpLst = new ArrayList<>();             
       BufferedReader reader = new BufferedReader( new FileReader( "dictionary.txt" )); 
       while(reader.ready()) 
       {
           tmpLst.add(reader.readLine());
       }                     	                   
       lst = tmpLst;
    }

    @Test
    public void test_allcollisions()
    {
       assertEquals(178686, HashTools.collisions(lst, 3 , new StringHash()));
       assertEquals(178686, HashTools.collisions(lst, 3 , new BetterHash()));
       assertEquals(178686, HashTools.collisions(lst, 3 , new MyHash()));
    }    

    @Test
    public void test_allmaxcollisions()
    {
       assertEquals(59882, HashTools.maxCollisions(lst, 3 , new StringHash()));
       assertEquals(59925, HashTools.maxCollisions(lst, 3 , new BetterHash()));
       assertEquals(59715, HashTools.maxCollisions(lst, 3 , new MyHash()));
    }

    @Test
    public void test_allavgChainLength()
    {
       assertEquals(59563.000, HashTools.avgChainLength(lst, 3 , new StringHash()), .001);
       assertEquals(59563.000, HashTools.avgChainLength(lst, 3 , new BetterHash()), .001);
       assertEquals(59563.000, HashTools.avgChainLength(lst, 3 , new MyHash()), .001);
    }

    @Test
    public void test_allunused()
    {
       assertEquals(0, HashTools.unused(lst, 3 , new StringHash()));
       assertEquals(0, HashTools.unused(lst, 3 , new BetterHash()));
       assertEquals(0, HashTools.unused(lst, 3 , new MyHash()));
    }

    @Test
    public void test_allcollisions2()
    {
       assertEquals(174688, HashTools.collisions(lst, 4000 , new StringHash()));
       assertEquals(174688, HashTools.collisions(lst, 4000 , new BetterHash()));
       assertEquals(177641, HashTools.collisions(lst, 4000 , new MyHash()));
    }

    @Test
    public void test_allmaxcollisions2()
    {
       assertEquals(73, HashTools.maxCollisions(lst, 4000 , new StringHash()));
       assertEquals(67, HashTools.maxCollisions(lst, 4000 , new BetterHash()));
       assertEquals(676, HashTools.maxCollisions(lst, 4000 , new MyHash()));
    }

    @Test
    public void test_allavgChainLength2()
    {
       assertEquals(44.661, HashTools.avgChainLength(lst, 4000 , new StringHash()), .001);
       assertEquals(44.661, HashTools.avgChainLength(lst, 4000 , new BetterHash()), .001);
       assertEquals(170.505, HashTools.avgChainLength(lst, 4000 , new MyHash()), .001);
    }

    @Test
    public void test_allunused2()
    {
       assertEquals(0, HashTools.unused(lst, 4000 , new StringHash()));
       assertEquals(0, HashTools.unused(lst, 4000 , new BetterHash()));
       assertEquals(2953, HashTools.unused(lst, 4000 , new MyHash()));
    }

    @Test
    public void test_allcollisions3()
    {
       assertEquals(95277, HashTools.collisions(lst, 100000 , new StringHash()));
       assertEquals(95263, HashTools.collisions(lst, 100000 , new BetterHash()));
       assertEquals(177641, HashTools.collisions(lst, 100000 , new MyHash()));
    }

    @Test
    public void test_allmaxcollisions3()
    {
       assertEquals(10, HashTools.maxCollisions(lst, 100000 , new StringHash()));
       assertEquals(10, HashTools.maxCollisions(lst, 100000 , new BetterHash()));
       assertEquals(676, HashTools.maxCollisions(lst, 100000 , new MyHash()));
    }

    @Test
    public void test_allavgChainLength3()
    {
       assertEquals(2.142, HashTools.avgChainLength(lst, 100000 , new StringHash()), .001);
       assertEquals(2.142, HashTools.avgChainLength(lst, 100000 , new BetterHash()), .001);
       assertEquals(170.505, HashTools.avgChainLength(lst, 100000 , new MyHash()), .001);
    }

    @Test
    public void test_allunused3()
    {
       assertEquals(16591, HashTools.unused(lst, 100000 , new StringHash()));
       assertEquals(16577, HashTools.unused(lst, 100000 , new BetterHash()));
       assertEquals(98955, HashTools.unused(lst, 100000 , new MyHash()));
    }
 
    @Test
    public void test_allcollisions4()
    {
       assertEquals(178186, HashTools.collisions(lst, 500 , new StringHash()));
       assertEquals(178186, HashTools.collisions(lst, 500 , new BetterHash()));
       assertEquals(178186, HashTools.collisions(lst, 500 , new MyHash()));
    }

    @Test
    public void test_allmaxcollisions4()
    {
       assertEquals(405, HashTools.maxCollisions(lst, 500 , new StringHash()));
       assertEquals(407, HashTools.maxCollisions(lst, 500 , new BetterHash()));
       assertEquals(710, HashTools.maxCollisions(lst, 500 , new MyHash()));
    }

    @Test
    public void test_allavgChainLength4()
    {
       assertEquals(355.247, HashTools.avgChainLength(lst, 500 , new StringHash()), .001);
       assertEquals(355.247, HashTools.avgChainLength(lst, 500 , new BetterHash()), .001);
       assertEquals(355.247, HashTools.avgChainLength(lst, 500 , new MyHash()), .001);
    }

    @Test
    public void test_allunused4()
    {
       assertEquals(0, HashTools.unused(lst, 500 , new StringHash()));
       assertEquals(0, HashTools.unused(lst, 500 , new BetterHash()));
       assertEquals(0, HashTools.unused(lst, 500 , new MyHash()));
    }
}
