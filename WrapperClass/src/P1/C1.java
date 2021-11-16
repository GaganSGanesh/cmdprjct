
package P1;

public class C1 {
public static void main(String[] args) {

/*  AutoBoxing:
It is the process of automatic conversion of primitive data type into its 
corresponding non primitive wrapper type.*/
	Byte b=50;
	Boolean b1=true;
	Long l=12345678L;
	System.out.println(b);
	System.out.println(l);
/*	UnBoxing:
	It is the process of automatic conversion of a non primitive wrapper data 
	into its corresponding primitive data.  */
		int x1=new Integer(312);
		Integer x2=new Integer(619);
		int i=x2;
		System.out.println(x1);
		System.out.println(x2.toString());
		System.out.println(i);
}
}



