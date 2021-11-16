package DayBeforeMock;
import java.util.Scanner;

public class Programs 
{
	static void greatest(int a,int b,int c)
	{
//		String s1=a>b&&a>c?a+" "+"is greatest":b>c&&b>a?b+" "+"is greatest":c+" "+"is greatest";
		String s1=a>b&&a>c?a+" "+"is greatest":b>c?b+" "+"is greatest":c+" "+"is greatest";
		System.out.println(s1);
	}	
	

	public static void main(String[] args) 
    {
	Scanner s=new Scanner(System.in);
	System.out.println("write three numbers for comparison");
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	greatest(a,b,c);
    }
}


