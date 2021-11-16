package Set;
import java.util.*;

class C2 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();  //implements list interface....
	
	LinkedList l=new LinkedList();//implements queue and list interface....
	
	a.add(4);
	a.add("milu");
	a.add(true);
	a.add(3.3);
	System.out.println(a);
	System.out.println();
	
	l.add(4);
	l.add("milu");
	l.add(true);
	l.add(3.3);
	System.out.println(l);
	System.out.println();
	
	Vector v=new Vector();//mehods are synchronised so thread safe
	v.add(1);
	v.add("Milu");
	v.add(true);
	v.add("Milu");
	System.out.println(v);
	
	}
}
