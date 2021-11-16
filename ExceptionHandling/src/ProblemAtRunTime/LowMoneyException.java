package ProblemAtRunTime;
import java.util.Scanner;

public class LowMoneyException extends Exception{
	
public LowMoneyException() {
	
}	
public LowMoneyException(String msg) {
	super(msg);
}	
public static void main(String[] args) {
	
}
}
class AtmDriver{
	public static void main(String[] args) {
		int monAvail=10000;
		Scanner s=new  Scanner(System.in);
		System.out.println("enter money to withdraw from atm");
		int money=s.nextInt();
		if(money>monAvail) {
			try {
				throw new LowMoneyException("Atm error");
			}
			catch (LowMoneyException l) {
				l.printStackTrace();
				l.getMessage();
				System.out.println("you have enterd more money than you have in account ");
			}
		}
		System.out.println("Happy banking with us");
	}
}
