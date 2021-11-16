package package1;

interface Area
{
	void area();
}
class Circle implements Area
{
	double rad=4.0;
	public void area()
	{
		System.out.println("area is "+3.141*rad*rad);
	}
	public String toString()
	{
		return "radius is "+rad+" and area is "+3.141*rad*rad;
	}
	public boolean equals(Object o)
	{
		return true;
	}
}
class Rectangle implements Area
{
	public void area()
	{
		
	}
}
public class AreaRunner {

	public static void main(String[] args) 
	{
		System.out.println("hello");
		Circle c=new Circle();
		System.out.println(c);
		System.out.println("after noon");
	}

}
