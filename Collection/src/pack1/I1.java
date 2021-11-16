package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class I1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	Iterator i=a.iterator();//return the object reference of iterator type
//	System.out.println(i);
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}
	while(i.hasNext())
	{
      int temp=(Integer)i.next();
	     i.remove();               
		 System.out.print(i.next()+" ");
		 System.out.println();
	}
	System.out.println();
	System.out.println(a);
}
}
