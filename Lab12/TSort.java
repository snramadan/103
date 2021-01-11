/**
 * Provided starting point for Java-based tsort.
 *
 * @author Hatalsky/Jones - Starting point.
 * @author Saba Ramadan - Completed by.
 *
 * @version CPE 103 Lab 12
 */
import java.io.*;
import java.util.*;
import java.lang.*;

public class TSort {
   // Hides the constructor form javadoc utility and users.
   private TSort() {}

   /**
    * Performs a topological sort of the specified directed acyclic graph.  The
    * graph is given as a string containing pairs of vertices representing
    * edges separated by spaces.  The resulting string will be formatted
    * identically to the Unix utility {@code tsort}.  That is, one vertex per
    * line in topologically sorted order.
    *
    * @param edges the edges of the DAG specified as space separated
    * vertex-pairs
    *
    * @return a topological ordering for the specified DAG
    *
    * @throws IllegalArgumentException if:
    * <ul>
    *   <li>edges is emtpy with the message "input contains no edges"</li>
    *   <li>edges has an odd number of vertices (incomplete pair) with the
    *   message "input contains an odd number of tokens"</li>
    *   <li>the graph contains a cycle (isn't acyclic) with the message "input
    *   contains a loop"</li>
    * </ul>
    */
   public static String tsort(String edges) 
   {
      return helper(edges);
   }

   private static String helper(String edges)
   {
      if (edges.length() == 0)
      {
         throw new IllegalArgumentException("input contains no edges");
      }
 
      Scanner scan = new Scanner(edges);
      HashMap<String, Vertex> hashmap = new HashMap<String, Vertex>();
      ArrayList<Vertex> order = new ArrayList<Vertex>();
   
      while (scan.hasNext()) 
      {
        String temp = scan.next();
        boolean hold = false;

        if (!scan.hasNext()) 
        {
          throw new IllegalArgumentException("input contains an odd number of tokens");
        }

        String temp2  = scan.next();

        Vertex V1 = hashmap.get(temp);
        Vertex V2 = hashmap.get(temp2);
        
        if (V1 == null)
        {   
            V1 = new Vertex(temp);
            hashmap.put(temp, V1);
            order.add(V1);
        }

        if (V2 == null) 
        {
            V2 = new Vertex(temp2);
            hashmap.put(temp2, V2);
            hold = true;
        }
        V2.d++;

        if (hold) 
        {
           order.add(V2);
        }
        V1.av.add(V2);
      }

      return helper2(hashmap, order);
   } 

   private static String helper2(HashMap<String, Vertex> hashmap, ArrayList<Vertex> order)
   { 
      ArrayList<Vertex> stack = new ArrayList<Vertex>();
      StringBuilder output = new StringBuilder();

      int elem = hashmap.size();
      int size = 0;

      for (int i = 0; i < order.size(); i++) 
      {
        Vertex v = order.get(i);
        if (v.d == 0) 
        {
           stack.add(v);
        }
      }

      if (stack.size() == 0)
      {
         throw new IllegalArgumentException("input contains a loop");
      }
 
      while (stack.size() > 0)
      {
         Vertex x = stack.remove(stack.size()-1);
         output.append(x.name + "\n");
         size++;
         for (Vertex v: x.av)
         {
            if (v.d == 1)
            {
              stack.add(v);
            }
            else
            {
               v.d--;
            }
         }
      }
 
      if (elem != size) 
      {
        throw new IllegalArgumentException("input contains a loop");
      }   
      
      return output.toString();       
   }

   private static class Vertex 
   {
      private int d = 0;
      private String name;
      private ArrayList<Vertex> av = new ArrayList<>();
      
      private Vertex(String name) 
      {
         this.name = name;
      }
   }

   /**
    * Entry point for the Java-based tsort utility allowing the user to specify
    * a file, redirect a file, or specify the input manually followed by
    * cntl-d to signal the end of input.
    */
   public static void main(String[] args) {
      Scanner scanner = null;

      if (args.length == 0) {
         scanner = new Scanner(System.in);
      } else if (args.length == 1) {
         try {
            scanner = new Scanner(new File(args[0]));
         } catch(FileNotFoundException e) {
            System.out.format("TSort: %s: No such file or directory\n", args[0]);
            System.exit(1);
         }
      } else {
         System.out.format("TSort: extra operand `%s'\n", args[1]);
         System.exit(1);
      }

      StringBuilder input = new StringBuilder();

      while (scanner.hasNext()) {
         input.append(scanner.next() + " ");
      }

      scanner.close();

      try {
         System.out.print(tsort(input.toString()));
      } catch(IllegalArgumentException e) {
         System.out.println("TSort: " + e.getMessage());
         System.exit(1);
      }
   }
}
