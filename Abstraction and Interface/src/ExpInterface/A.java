package ExpInterface;

public interface A {
	public static final int i=8;
	public abstract void print();
	int j=10;			//In both way we can write
	void display();
}
abstract class B implements A{
	abstract void add();
}
//class C extends B{
//	
//}
