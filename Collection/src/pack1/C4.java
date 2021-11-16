package pack1;
import java.util.Scanner;
import java.util.ArrayList;
public class C4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(39);
		a.add(56);
		a.add(91);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an element to search");
		int key=s.nextInt();
		System.out.println(a.contains(key));
		int a1=a.indexOf(key);
		System.out.println("The index of a1 is "+a1);
		
		System.out.println(a.containsAll(a));
		ArrayList a3=new ArrayList();
		
		
	}

}
