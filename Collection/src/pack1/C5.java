package pack1;
import java.util.ArrayList;
import java.util.Scanner;
public class C5 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	Scanner s=new Scanner(System.in);
//	a.add(s.next());
//	a.add(s.next());
//	a.add(s.next());
	a.add("delhi");
	a.add("mumbai");
	a.add("goa");
	System.out.println(a);
//	System.out.println("enter a city to remove it");
	System.out.println("enter city to add if not present");
	String s1=s.next();
//	a.remove(s1);

	ArrayList a3=new ArrayList(a);
	System.out.println(a3);
	}
}
