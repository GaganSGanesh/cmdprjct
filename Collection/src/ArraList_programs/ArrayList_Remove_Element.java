//remove the third element from a array list
package ArraList_programs;

import java.util.ArrayList;

class ArrayList_Remove_Element {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(8);
		a.add("Milu");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
	}
}
//search an element in a array list

class ArrayList_Search_Element {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(8);
		a.add(5);		
		a.add(8);
		a.add("Milu");
		System.out.println(a);
		System.out.println(a.contains("Nilu"));
	}
}
