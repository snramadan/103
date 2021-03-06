/**
 * JUnit Sample tests for BSC class (Balanced Symbol Checker). 
 *
 * @author Paul Hatalsky
 * @version 1/23/2017 Developed for CPE 103 Lab 3 
 */
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.rules.*;
import org.junit.runner.Description;
import java.util.concurrent.TimeUnit;
import java.io.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BSCSampleTests
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

   // A single, very trivial test is below!
   @Test
   public void test01_simpleString() 
   {
      assertTrue(BSC.isBalanced("[hello]"));
   }
}
