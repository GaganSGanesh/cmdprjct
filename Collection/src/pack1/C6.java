package pack1;
import java.util.ArrayList;//ctrl+shift+O

public class C6 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(2);
	a.add("hi");
	a.add('c');
	a.add(3.8);
	ArrayList a1=new ArrayList();
	a1.add(a);
	a1.add("goa");
	a1.add("pune");
	System.out.println(a1);
	System.out.println(a1.get(0));
	
}
}


