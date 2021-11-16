package Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C1 {
public static void main(String[] args) {
	HashSet h=new HashSet();//insertion order is not preserved
	h.add(10);				//duplicates not allowed
	h.add(20);				//non homogeneous is ok...	
	h.add("sudeep");		
	h.add(30);
	h.add(10);
	System.out.println(h);
	System.out.println();
	LinkedHashSet l=new LinkedHashSet();//duplicates not allowed...maintain insertion order
	l.add(2);							//non homogeneous is ok...
	l.add(4);
	l.add(2);
	l.add(0);
	l.add("Milu");
	System.out.println(l);
	System.out.println();
	TreeSet t=new TreeSet();//stored in sorted format...duplicates not allowed...insertion order not preserved
	t.add(3);				//only homogeneous
	t.add(1);
	t.add(0);
	t.add(3);
//	t.add("milu");//class cast exception String can't caste to integer
	t.add(2);
	System.out.println(t); 
}
}
