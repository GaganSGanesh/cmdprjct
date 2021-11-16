
public class EmployeeDriver 
{
	public static void main(String[] args) 
	{
		Employee e=new Employee(5000.0);
	//	System.out.println(e.sal);
		System.out.println(e.getSal());
		e.setSal(6000);
		System.out.println(e.getSal());
		e.setSal(1.1*e.getSal());
		System.out.println(e.getSal());
	}
}
