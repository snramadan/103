/**
 * BSC JUnit Test
 *
 * @author  Saba Ramadan
 * @version Lab 3
 * @version CPE103-03
 * @version Winter 2017
 */

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class BSCTests
{   
   @Test
   public void test1() {
      assertTrue(BSC.isBalanced("[(Hello) {W}orld!]"));
   }

   @Test
   public void test2() {
      assertTrue(BSC.isBalanced("()"));
   }
   
   @Test
   public void test3() {
      assertFalse(BSC.isBalanced("{hello)"));
   }
   
   @Test
   public void test4() {
      assertFalse(BSC.isBalanced("{[}]"));
   }
   
   @Test
   public void test5() {
      assertFalse(BSC.isBalanced("hello {w}(orld>>>>>>>>>>>>>>>>>>>>>>>"));
   }

   @Test
   public void test6() {
      assertFalse(BSC.isBalanced("HELLO[}>]"));
   }

   @Test
   public void test7() {
      assertFalse(BSC.isBalanced("BYE>"));
   }

   @Test
   public void test8() {
      assertTrue(BSC.isBalanced("<>"));
   }
   
   @Test
   public void test9() {
      assertTrue(BSC.isBalanced(""));
   }
   
   @Test
   public void test10() {
      assertTrue(BSC.isBalanced("(( ))"));
   }

   @Test
   public void test11() {
      assertFalse(BSC.isBalanced("( [ ) }"));
   }      
}
