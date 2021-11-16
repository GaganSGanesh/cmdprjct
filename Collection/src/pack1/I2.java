package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class I2 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("Ronaldo");
	a.add("Messi");
	a.add("Neymar");
	Iterator i=a.iterator();
	ListIterator l=(ListIterator) i;
	l.hasNext();
	while(i.hasNext()) 
	{
		String s=(String)i.next();
		System.out.println(s.length());
	}
}
}
