
abstract class AbstractClass
{
	int i=10;
	int j=20;
	void display()
	{
		System.out.println("hello world!!!");
	}
	abstract void print();
}
class ConcreteClass extends AbstractClass
{
	void print()
	{}
}
class MainRunner
{
	public static void main(String[] args) 
	{
		AbstractClass a =new ConcreteClass();
		System.out.println(a.i);
		AbstractClass b;
//		b.display();
		b=a;
		b.display();
	}
}

