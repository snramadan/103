/**
 * JUnit Sample tests for SimpleArrayStack.
 *
 * @author Paul Hatalsky
 * @version 1/23/2017 Developed for CPE 103 Lab 3
 */
import static org.junit.Assert.*;
import org.junit.*;
import java.util.NoSuchElementException;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.io.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimpleArrayStackSampleTests 
{
   @Rule 
   public TestWatcher watcher = new TestWatcher() {
      protected void starting(Description description) {
         System.out.printf("\b\bStarting: %-48s", description.getMethodName());
      }
   };
   
   @Rule 
   public Stopwatch sw = new Stopwatch() {
      String s;
      protected void finished(long nanos, Description description) {
         System.out.println(s);
      }
      protected void succeeded(long nanos, Description description) {
         s = "Passed" + " (" + runtime(TimeUnit.MILLISECONDS) + " ms)";
      }
      protected void failed(long nanos, Throwable e, Description description) {
         s = "FAILED" + " (" + runtime(TimeUnit.MILLISECONDS) + " ms)";        
      }
   };

   // Some trivial tests below!
   @Test
   public void test01_simpleTests() {
      SimpleArrayStack<Integer> s = new SimpleArrayStack<Integer>();
      
      assertEquals(10, s.capacity());      
      assertEquals(0, s.size());
      s.push(100);
      assertEquals((Integer)100, s.peek());
      assertEquals((Integer)100, s.pop());
   }
   
   @Test(expected=NoSuchElementException.class)
   public void test02_peekAtConstruction() {
      SimpleArrayStack<Integer> s = new SimpleArrayStack<Integer>();
      s.peek();
   }
}
