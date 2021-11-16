import java.util.Scanner;
public class CountUpperCase 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");		
		String s=sc.nextLine();
		int count=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)>='A'&&s.charAt(j)<='Z')
			count++;
				
		}
		System.out.println(count);
	}
}
