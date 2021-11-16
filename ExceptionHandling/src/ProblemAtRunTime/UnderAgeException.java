package ProblemAtRunTime;
import java.util.Scanner;

public class UnderAgeException extends Exception{
	public UnderAgeException() {
		super();
		System.out.println("you have not the right age to vote");
	}
	UnderAgeException(String msg)
	{
		super(msg);
	}	
	public static void main(String[] args) {
		
	}
}
class Driver{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your age");
		int age=s.nextInt();
		try {
			if(age<18) {
				throw new UnderAgeException();
				}
			System.out.println("inside try block");
		}
		catch(UnderAgeException u) {
			System.out.println("grow up first");
			
		}
	}
}
