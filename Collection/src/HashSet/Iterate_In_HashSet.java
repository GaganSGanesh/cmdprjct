package HashSet;
import java.util.*;
import java.util.Iterator;

public class Iterate_In_HashSet {
	  public static void main(String[] args) {
	         // Create a empty hash set
	     HashSet<String> h_set = new HashSet<String>();
	   // use add() method to add values in the hash set
	          h_set.add("Red");
	          h_set.add("Green");
	          h_set.add("Black");
	          h_set.add("White");
	          h_set.add("Pink");
	          h_set.add("Yellow");
	          iterate(h_set);
	   }
 
	  static void iterate(HashSet<String> h_set) {
		  // set Iterator 
		  Iterator<String> p = h_set.iterator();
		  // Iterate the hash set
		  while (p.hasNext()) {
			  System.out.println(p.next());
	  }
}
	  static void iterate1(HashSet<String> h_set) {
		  for (String ele : h_set) {
	            // Print HashSet data
	            System.out.print(ele + " ");
	        }
	  }

}