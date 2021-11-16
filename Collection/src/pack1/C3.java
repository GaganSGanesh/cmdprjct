package pack1;
import java.util.ArrayList;
public class C3 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("Apple");
	a.add("Mango");
	a.add("Pineapple");
	System.out.println(a);
	a.add(1,"Carrot");
	System.out.println(a);
	a.add(33.334);
	System.out.println(a);
	ArrayList a1=new ArrayList();
	
	a1.add("orange");
	a1.add("keyboard");
	a1.addAll(a);
	System.out.println(a1);
	a1.add(3,a);
}
}
