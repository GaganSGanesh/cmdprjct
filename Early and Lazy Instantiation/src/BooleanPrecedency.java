
public class BooleanPrecedency
{
	public static void main(String[] args) 
	{
		System.out.println(true||false&& false&&false);
		System.out.println(false&&false||true&&true);
		System.out.println(true||false&&false);
		System.out.println(false&&false||true&&false);
	}
}
