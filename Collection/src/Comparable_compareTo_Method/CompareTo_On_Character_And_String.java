package Comparable_compareTo_Method;
import java.util.Comparator;
import java.util.TreeSet;

import org.omg.CORBA.Object;

public class CompareTo_On_Character_And_String {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add('d');
		t.add('a');
		t.add('z');
		t.add('r');
		System.out.println(t);
		
		TreeSet t2=new TreeSet(new MyComparator());
		t2.add('d');
		t2.add('a');
		t2.add('z');
		t2.add('r');
		System.out.println(t2);
	}
}
class MyComparator implements Comparator{
	@Override
	public int compare(java.lang.Object obj1,java.lang.Object obj2) {
		char c1=(Character)obj1;
		char c2=(Character)obj2;
		return c1<c2?1:c1>c2?-1:0;
		
	}	
}
class NoBody{
	public static void main(String[] args) {
		Character i1='a';
		Character i2='d';
		System.out.println(i1.compareTo(i2));// Output is 'd'-'a'=3

//Character class implemented compareTo() method		
	}
}



