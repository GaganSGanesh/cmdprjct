package LinkedList;

import java.util.*;

public class program {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(8);
		l.add(5);		
		l.add(8);
		l.add(0,"Milu");
		System.out.println(l);
		System.out.println(l.get(2)); 
//.get(n)->in the background. It traverse from the head and then retrieves the nth element		
		
} 
}
