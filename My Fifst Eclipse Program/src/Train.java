
public class Train 
{
	public static void main(String[] args) 
	{
		String s1=new String("hello");
		String s2=new String("hi");
		System.out.println(s1.equals(s2));
		System.out.println(s1);//toString of String class is over ridden
		
		Train t=new Train();
		System.out.println(t);//toString of Train class is not over ridden 
	}
}
