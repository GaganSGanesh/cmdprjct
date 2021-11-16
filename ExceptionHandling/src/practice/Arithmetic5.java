package practice;

import java.util.Scanner;

public class Arithmetic5 {
	public static void main(String[] args) throws ArithmeticException{
		System.out.println("main starts");

		Scanner s=new Scanner(System.in);
			int a=5/0;	
			System.out.println("enter a number"); 
			int b=s.nextInt();
		System.out.println("main ends");
	}
}
