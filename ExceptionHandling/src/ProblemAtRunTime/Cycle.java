package ProblemAtRunTime;

public class Cycle extends Throwable {
	Cycle(){
		System.out.println("it is cycle");//this become like printstacktrace() method
	}
	public static void main(String[] args) {
	}
}
class CycleDriver{
	public static void main(String[] args) {
		int wheel=4;
		try {
			if(wheel>2)
				throw new Cycle();
		}
		catch(Cycle c) {
			System.out.println("buy a bike");
		}
	}
}
