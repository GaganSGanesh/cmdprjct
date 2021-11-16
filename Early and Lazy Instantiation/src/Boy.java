
public class Boy extends Student
{
	String name;
//	a=10;         // we can't initialise instance variable like this
	{name="raj";}
    static int  a;
	public static void main(String[] args) 
	{
		Boy b=new Boy();
		System.out.println(b.name);
	}
}
