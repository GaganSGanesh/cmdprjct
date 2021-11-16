package Collections_Class;
import java.lang.*;
import java.util.*;

public class Collections_Comparator_Interface {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(8);
	a.add(3);
	a.add(0);
	a.add(5);
	a.add(2);
	System.out.println(a);
	Collections.sort(a,new MyComparator());
	System.out.println(a);
}
}
class MyComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
		
	}
}
