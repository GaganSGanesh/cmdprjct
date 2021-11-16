
public class Employee 
{
	private double sal;
	Employee(){}
	Employee(double sal)
	{
		this.sal=sal;
	}
	public double getSal()
	{
		return sal;
	}
	public void setSal(double sal)
	{
		if(sal>4000)
			this.sal=sal;
		else 
			System.out.println("set salary more than 4000");
	}	
}
