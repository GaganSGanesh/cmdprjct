package LinkedList;
import java.util.*;

public class Iterate_All_Element_LinkedList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(8);
		l.add(5);		
		l.add(8);
		l.add("Milu");
		l.add(9);
		System.out.println(l);
		reverseUsingListIterator( l);
//		System.out.println();
//		reverseUsingListIterator2( l);
/*		Iterator i=l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		i.remove();//remove the last element it printed
		System.out.print("\n"+l);
		*/
//		ListIterator j = l.listIterator();
//		while(j.hasNext()) {
//			System.out.print(j.next()+" ");
//		}
//		System.out.print("\n"+l);
	}
static void w3resource() {
    // create an empty linked list
    LinkedList<String> list = new LinkedList<String>();
  // use add() method to add values in the linked list
         list.add("Red");
         list.add("Green");
         list.add("Black");
         list.add("White");
         list.add("Pink");
        // Print the linked list
 for (String element : list) {
   System.out.println(element);
   }
}
static void reverseUsingListIterator(List l) {
//	ListIterator l1=l.listIterator();
	ListIterator l1=l.listIterator(l.size());
	while(l1.hasPrevious()) {
		System.out.print(l1.previous()+" ");

	}
}
static void reverseUsingListIterator2(LinkedList l) {
	Iterator l1 = l.descendingIterator();
	System.out.println("Value is : "+ l1.next());
	System.out.println("Value is : "+ l1.next());
	System.out.println("Value is : "+ l1.next());
//	while (l1.hasNext()) {
//        System.out.println("Value is : "+ l1.next());
//    }
}
}
