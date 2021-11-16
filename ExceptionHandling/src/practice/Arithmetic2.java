package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
			
	try {
		int a=5/0;	//found exception in this line
		System.out.println("enter a number"); //cursor not coming to this line or below it 
		int b=s.nextInt();
	}
	catch(ArithmeticException a){
		System.out.println("0 can't be at denominator");
	}
	catch(InputMismatchException i) {
		System.out.println("enter integer number");
	}
	System.out.println("main ends");
	
}
}
