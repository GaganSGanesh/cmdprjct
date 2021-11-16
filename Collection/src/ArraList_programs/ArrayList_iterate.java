package ArraList_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_iterate {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(3);		
		a.add(12);		
		a.add(8);
		Iterator i=a.iterator();
		
	/*	System.out.println(i);
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());*/
		
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println(); 
//		for(Object j:a) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//		for(Object j:a) {
//			int temp=(Integer)j; //type casting and auto unboxing
//			System.out.print(temp+" ");
//		}
//		System.out.println();
//		for(int k=0;k<a.size();k++) {
//			System.out.print(a.get(k)+" ");
//		}
	}
}



