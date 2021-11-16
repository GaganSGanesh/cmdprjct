package CompileTimeException;

class A {
	
public static void main(String[] args) throws InterruptedException {
	System.out.println("Main starts");
	
	Thread.sleep(5000);				
	
	System.out.println("main ends");
	}
}
