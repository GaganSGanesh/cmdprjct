package Practice;
import java.util.ArrayList;

public class Guest {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("silu");
	ar.add("bubu");
	
	ArrayList a=new ArrayList();
	a.add("Milu");   a.add("Nilu");   
	a.add(ar);
	a.add("Bulu");
	ArrayList a1=new ArrayList();
	a1.add("khali");
	a1.add("lipu");
	a1.add(a);
	System.out.println(a1);
	ArrayList c=new ArrayList();
	System.out.println(c.size());
	System.out.println(a.iterator());
	System.out.println(a.add("hello"));
	System.out.println(a);
	System.out.println(a.remove(0));
}
}









