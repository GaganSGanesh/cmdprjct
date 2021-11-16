import java.util.Scanner;
public class ArrayFactorial
{
	static int factorial(int i)
	{
		int fact=1;
		while(i>0)
		{
			fact= fact*i;
			i--;
		}		
	  return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter numbers in array");
		int[] s=new int[n];
		for(int i=0;i<s.length;i++)
		{
			s[i]=sc.nextInt();
		}
		int[] factorial=new int[n];
		for(int i=0;i<s.length;i++)
		{
			factorial[i]=factorial(s[i]);
		}
		System.out.println("factorial of array is ");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(factorial[i]+" ");
			
		}
	}
}
