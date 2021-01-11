/**
 * JUnit tests for Topological Sort
 *
 * @author Saba Ramadan
 * @version lab 12
 */

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.runners.MethodSorters;
import java.math.BigInteger;
import java.io.*;
import java.lang.*;

public class TSortTests
{
   @Test
   public void test_Sort() 
   {
      String input = "1 2\n2 3\n2 25 3 48 48 49 3\n57 25 57 49 30 57 30\n\n\n\n30 31 48 45";
      String expect = "1 2 25 3 57 48 45\n49\n30\n31\n";
      String actual = TSort.tsort(input);

      Scanner scanExpect = new Scanner(expect);
      Scanner scanActual = new Scanner(actual);

      while (scanExpect.hasNext())
      {
         assertEquals(scanExpect.next(),scanActual.next());
      }
      assertFalse(scanActual.hasNext());
   }

   @Test
   public void testException_NoEdges()  
   { 
      try
      {
        String input = "";
        TSort.tsort(input);
      }
      catch (Exception e) 
      {
        assertEquals("input contains no edges", e.getMessage() );
      }
   }   

   @Test
   public void testException_OddNumber()  
   { 
      try
      {
	 TSort.tsort("2 3\n 1\n23 33");
      } 
      catch (Exception e) 
      {
	 assertEquals("input contains an odd number of tokens", e.getMessage() );
      }
   }
}

