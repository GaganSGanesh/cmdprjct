package DayBeforeMock;
class A{
	public static void main(String[] args) {
		System.out.println("hello this is another class main method");
	}
}
public class CallingMainMethod {
public static void main(String[] args) {

	A.main(null);
//	args="MIlu";
//	Args= {"milu","nilu"};
	
	A.main(args);
	
//	args=new args[4];
}
}
