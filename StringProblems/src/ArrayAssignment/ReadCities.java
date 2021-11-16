package ArrayAssignment;
import java.util.Scanner;
public class ReadCities 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name of ten cities");
		String[] s=new String[10];
		for(int i=0;i<=9;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<=9;i++)
		{
			if(i%2==0&&i%3==0)
				System.out.println(s[i]+" idex is "+i);
		}
	}

}
