package practice;

public class Example {
public static void main(String[] args) {
	try {
		System.out.println(3/0);
		System.out.println("in try");
	}
//ERROR WILL BE THROWN BUT CAN'T CATCH BY CODE BUT BY JVM THEN LONG EXCEPTION MSG WILL PRINTED	
//	catch(NullPointException a) 
//	{
//		System.out.println("Exception: "+a.getMessage());
//	}
	catch(ArithmeticException a)//if we don't print any message then no message will show in console 
	{
		System.out.println("Exception: "+a.getMessage());
	}
	System.out.println("hello");
}
}
