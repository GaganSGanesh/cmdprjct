public class string 
{
	static void m()
	{
		String s1=new String("Hello");
		System.out.println(s1.concat(" Milu"));
		System.out.println(s1);
		System.out.println(s1.concat(" Good Morning"));
		System.out.println(s1);
		String s2=new String(s1.concat(" Milu"));
		System.out.println(s2);
	}
	static void n()
	{
		String s1=new String("you cannot change me");
		String s2=new String("you cannot change me");
		System.out.println(s1==s2);
		String s3="you cannot change me";
		String s4="you cannot change me";
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		String s5="you cannot"+" change me";
		System.out.println(s3==s5);
		String s6="you cannot";
		String s7=s6+" change me";//somehow object is creating in heap area
		System.out.println(s3==s7);
		
	}
	public static void main(String[] args) 
	{
	//	m();
		n();
	}
}
