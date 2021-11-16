
public class Bus 
{
	int w;
	Bus(){ System.out.println("hello");}
	Bus(int a)
	{
		Bus b=new Bus(); 
		System.out.println(b.w);
	}
	public static void main(String[] args)
	{
		Bus b=new Bus(6);
	}
}
