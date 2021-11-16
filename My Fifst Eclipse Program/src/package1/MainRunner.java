package package1;
class A
{}
class B extends A
{}
class D extends B
{}
public class MainRunner 
{
	public static void main()
	{
	A a=new D();
	System.out.println("good night");

	}
}