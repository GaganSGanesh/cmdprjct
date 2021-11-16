package pack1;
import java.util.ArrayList;
public class C1 {
	public static void main(String[] args) {
	
	ArrayList a=new ArrayList();
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(1);
	System.out.println(a);
	Object a22=a.toArray();
	Object[] a2=a.toArray();
	for(Object i:a2)
	{
		System.out.println(i);
	}
//	a.addAll();
//	System.out.println(a.toArray());
//	ArrayList a2=new ArrayList(a);
//	System.out.println(a2);
//	a2.add("Milu");
//	System.out.println(a2);
//	System.out.println(a2.size());
}
}
