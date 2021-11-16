import java.util.Scanner;
public class StringToUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");		
		String s=sc.nextLine();
		String s1="";
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)>='A'&&s.charAt(j)<='Z')
				s1=s1+s.charAt(j);
			else
				s1=s1+(char)(s.charAt(j)-32);
				
		}
		System.out.println(s1);
	}

}
