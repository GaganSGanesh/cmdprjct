package ArraList_programs;
import java.util.ArrayList;
import java.util.Collections;
//copy one array list into another.

public class Copy_ArrayList_To_Another {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(8);
		a.add("Milu");
		a.add(9);
		ArrayList b=new ArrayList();
		b.add(1);b.add(4);b.add(3);b.add(7);b.add(00);
		System.out.println(b);
		Collections.copy(b,a);
		System.out.println("after copy is");
		System.out.println(b);
	}
}
