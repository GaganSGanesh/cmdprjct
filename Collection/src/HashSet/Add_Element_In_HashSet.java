package HashSet;
import java.util.Collections;
import java.util.HashSet;

public class Add_Element_In_HashSet {
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
	          h_set.add("Green");

	   // print the hash set
	   System.out.println("The Hash Set:\n" + h_set);
	   System.out.println(h_set.getClass());
	   }
	}
