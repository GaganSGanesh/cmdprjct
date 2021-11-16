package ArraList_programs;

import java.util.ArrayList;
import java.util.Collections;
//sort a given array list

public class ArrayList_Sort_Element {
		public static void main(String[] args) {
			ArrayList a=new ArrayList();
			a.add(8);
			a.add(5);		
			a.add(8);
			a.add("Milu");
			a.add(9);
			a.add(1);
			System.out.println(a);
//			Collections.sort(a);
//			System.out.println(a);
//			Collections.reverse(a);
//			System.out.println("The reverse is:"+a);
			Collections.shuffle(a);
			System.out.println("The shuffle is:"+a);
//			Collections.sort(a,);
			
		}
	}
