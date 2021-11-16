package CompileTimeException;

class Aaa {

	public static void main(String[] rags) throws InterruptedException {
		System.out.println("main starts");
		Thread.sleep(4000);
		System.out.println("main ends");
	}
}
class B {

public static void main(String[] args) {
	System.out.println("main starts");
	try {
	Thread.sleep(2000);
	}
	catch(InterruptedException i){
		System.out.println("Exception: "+i.getMessage());
	}
	System.out.println("main ends");
}
}