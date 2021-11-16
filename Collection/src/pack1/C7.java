package pack1;

import java.util.ArrayList;

public class C7 {
	public static void main(String[] args) {
		Object[] o=new Object[4];
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(1);
		System.out.println(a);
		Object o1=a.toArray();
		System.out.println(o1);
		Object[] o2=a.toArray();
		for(Object i:o2)
		{
			System.out.print(i+" ");
		}
//		int[] j=a.toArray();
	}

}
