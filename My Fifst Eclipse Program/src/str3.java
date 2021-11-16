
public class str3
{
	public static void main(String[]args)
	{
		String s="DELHI";
		byte[] b= {65,66,67,68,69};
		byte[] b1= {'s','u','m','a'};//check why not showing any error
		String s1=new String(b);
		System.out.println(s1);
		String s2=new String(b1);
		System.out.println(s2);
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int j=ch;
			System.out.println("the ASCII value of "+ch+" is "+j);
		}
	}
}
