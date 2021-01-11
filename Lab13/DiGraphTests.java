/*
 * DiGraphTests
 *
 * @author Saba Ramadan
 */

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.lang.*;

public class DiGraphTests 
{
   @Test (expected = IllegalArgumentException.class)
   public void test() throws FileNotFoundException, IOException
   {
      FileWriter f = new FileWriter("test.txt");
      f.write("1 4\n5 7 6");
      f.close();
      DiGraph d = new DiGraph("test.txt");
   }  

   @Test (expected = IllegalArgumentException.class)
   public void test1() throws FileNotFoundException, IOException
   {
      FileWriter f = new FileWriter("test.txt");
      f.write("");
      f.close();
      DiGraph d = new DiGraph("test.txt"); 
   }

   @Test (expected = IllegalArgumentException.class)
   public void test2() throws FileNotFoundException, IOException
   {
      FileWriter f = new FileWriter("test.txt");
      f.write("1");
      f.close();
      DiGraph d = new DiGraph("test.txt");
   } 

   @Test (expected = IllegalArgumentException.class)
   public void test3() throws FileNotFoundException, IOException
   {
      FileWriter f = new FileWriter("test.txt");
      f.write("a b c d e");
      f.close();
      DiGraph d = new DiGraph("test.txt");
   }

   @Test (expected = IllegalArgumentException.class)
   public void test4() throws FileNotFoundException, IOException
   {
      FileWriter f = new FileWriter("test.txt");
      f.write("1 2 -10");
      f.close();
      DiGraph d = new DiGraph("test.txt");
   }

   @Test
   public void test_all() throws FileNotFoundException, IOException
   {
      DiGraph d = new DiGraph("inputSparse");

      d.setStart("AA");
   }
}
