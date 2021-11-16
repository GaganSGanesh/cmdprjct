package LinkedList;
import java.util.*;

public class Reverse_The_LinkedList {
   static void Reverse(LinkedList<String> list) {
	    Iterator it = list.descendingIterator();
	    
	     // Print list elements in reverse order
	     System.out.println("Elements in Reverse Order:");
	     while (it.hasNext()) {
	        System.out.println(it.next());
	     }
   }
   static void Reverse1(LinkedList<String> list) {
	          Collections.reverse(list);
   }
   static void Reverse2(LinkedList<String> list) {
	   for(int i=list.size()-1;i>0;i--)
	   {
		   System.out.println(list.get(i));
	   }
   }
   public static void main(String[] args) {
	    // create an empty linked list
	   LinkedList<String> list = new LinkedList<String>();
       list.add("Red");
       list.add("Green");
       list.add("Black");
       list.add("Pink");
       list.add("orange");
       
       Reverse2(list);
   }
}
