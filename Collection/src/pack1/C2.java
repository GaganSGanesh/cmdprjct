//
package pack1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class C2 {
public static void main(String[] args) {
	Collection a=new ArrayList();
	a.add("Bengaluru");
	a.add("Delhi");
	a.add("Mumbai");
	a.add("Pune");
	System.out.println(a);
//	System.out.println(a[0]);//we can't print like this
	ArrayList b=new ArrayList();
	b.add(a);
	System.out.println(b);
	Iterator i=a.iterator();
	System.out.println(i);
	Collection cc=b;
	
	}
}



