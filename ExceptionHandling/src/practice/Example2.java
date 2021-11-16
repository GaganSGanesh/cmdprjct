package practice;

public class Example2 {
public static void main(String[] args) {
	int balance=5000;
	int withdrawlAmount=6000;
	try {
		if(balance<withdrawlAmount)
			throw new ArithmeticException("insufficient balance");
		balance=balance-withdrawlAmount;
		System.out.println("Transaction successfully completed");
	}
	catch(ArithmeticException a) {
		System.out.println("Exception: "+a.getMessage());
	}
	System.out.println("program continues");
}
}
