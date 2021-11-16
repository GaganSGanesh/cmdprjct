package practice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic3 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	try {
		int a=5/0;	
		}
	catch(ArithmeticException a){
		System.out.println("0 can't be at denominator");
	}
	try {
		System.out.println("enter a number"); 
		int b=s.nextInt();
	}
	catch(InputMismatchException i) {
		System.out.println("enter integer number , you have entered something else");
	}
	System.out.println("main ends");
}
}
