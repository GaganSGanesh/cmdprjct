//Java program to convert a hash set to an array.


package HashSet;
import java.util.*;

public class Convert_HashSet_To_Array {
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
	      System.out.println("Original Hash Set:\n" + h_set);
	      // Creating an Array
	      String[] new_array = new String[h_set.size()];
	      h_set.toArray(new_array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	      for(String element : new_array){
	        System.out.println(element);
	     }
	      
	      List new_list=new ArrayList(h_set);
		      for(Object element : new_list){
		        System.out.println((String)element);
		     }
	      
	   }
	}

