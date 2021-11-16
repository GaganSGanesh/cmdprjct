package Comparable_compareTo_Method;
import java.util.*;
class Milu{
	/*static void reverse(List list)
	{
		ArrayList l=(ArrayList)list;
		int n=l.size();
		for(int i=0;i<n/2;i++){
			Object temp=l.get(n-1-i);
			Object notemp=l.get(i);
			l.set(i,temp);
			l.set(n-1-i,notemp);
		}
	}*/
    static void reverse(ArrayList a) {
    	int n=a.size();
		for(int i=0;i<n/2;i++){
			Object temp=a.get(n-1-i);
			Object notemp=a.get(i);
			a.set(i,temp);
			a.set(n-1-i,notemp);
		}
    }
    
}
public class C1 {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(30);
	a.add(40);
	a.add(20);
//	System.out.println(a);
//	Collections.sort(a);
//	System.out.println(a);
	Milu.reverse(a);
	System.out.println(a);
}
}
