package practice;

public class Arithmetic {
public static void main(String[] args){
	System.out.println("main starts");
	System.out.println("main continues");
	System.out.println("main is running");
	try {
	int c=6/0;
	}
	catch (Exception e) {
		e.printStackTrace();
			System.out.println("\n"+e .toString() );
		System.out.println("\n"+e.getMessage());
	}
	//Unreachable catch block for ArithmeticException. It is 
	//already handled by the catch block for Exception
		/*
		 * catch (ArithmeticException g) { 
		 * }
		 */
	
//	System.out.println(c);
	System.out.println();
	System.out.println("main ends\n");
	
}
}
