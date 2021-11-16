package MainMethod;

public class Experiment {
public static void main(String[] args) {
	String s=null;
//	s.concat("hi"); can't call because no object get created
	String s2=s+"hi";
	System.out.println(s+" hi");
	System.out.println(s2);
	s="hello";
	System.out.println(s);
	int[] a=new int[5]; 
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[0]);
	String b=null;            //no object is created
//	System.out.println(b.isEmpty());
	System.out.println(b);
	b="milu"; 				  //object get created in string pool
	System.out.println(b.isEmpty());
	
	
}
}
