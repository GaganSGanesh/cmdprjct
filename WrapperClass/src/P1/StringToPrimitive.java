//String representation of primitives to actual primitives
package P1;

public class StringToPrimitive {
public static void main(String[] args) {
	int i=Integer.parseInt("20");
	double d= Double.parseDouble("25.22");
	boolean b= Boolean.parseBoolean("false");
//	int x=Integer.parseInt("Hello");//NumberFormatException
	boolean b1= Boolean.parseBoolean("true");//true
	boolean b2= Boolean.parseBoolean("hi");//false
	boolean b3= Boolean.parseBoolean("xyz");//false
	System.out.println(i);
	System.out.println(d);
	System.out.println(b);
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
}
}
