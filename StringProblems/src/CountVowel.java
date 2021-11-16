import java.util.Scanner;
public class CountVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");		
		String s=sc.nextLine();
		int count=0;
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
			   count++;
				
		}
		System.out.println(count);
	}
}
