package SmartProgramming;

import java.io.FileNotFoundException;
/*
public class S1 {
public static void main(String[] args) throws FileNotFoundException{
	System.out.println("good morning");
//	System.out.println(a);    //java.lang.Error: Unresolved compilation problem: 
	throw new FileNotFoundException();
	
	System.out.println("good night");
	
	}
}
// } // java.lang.Error unresolved compilation problem
*/

public class S1 {
	public static void main(String[] args) /* throws FileNotFoundException */{
	System.out.println("good morning");
	try {
	throw new FileNotFoundException();
	}
	catch(FileNotFoundException f) {
		
	}
	System.out.println("good night");//compiler is coming after adding try catch block
	}
}
