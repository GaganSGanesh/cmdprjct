
public class Student 
{
	int sid;
	String name;
	static double per;
	{
		sid=101;
		name="milu";
		per=80;
	}
	public static void main(String[] args) 
	{
		System.out.println(per);
		Student s=new Student();
		System.out.println(per);
		System.out.println(s.name);
	}
}
