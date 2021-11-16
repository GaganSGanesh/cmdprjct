package Practice;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
import java.util.*;

class Morning {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("chak");
		c.add("de");
//		c.add(0,"chak");
		List l=(List)c;
		l.add("india");
		System.out.println(c);
		l.add(0,"chak");
		System.out.println(l);
		c.add("hockey");
		l.add("team");
		System.out.println(c);
		System.out.println(c==l);
		System.out.println(new ArrayList());
		c.add("chak");
		System.out.println(c);
		
	}

}
