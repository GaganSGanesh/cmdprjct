
public class PhoneRunner 
{
	public static void main(String[] args) 
	{
		Phone p=new Phone();
		p.insertSim(new Sim());
		System.out.println(p);
		System.out.println(p.s);
	}
}
