import java.util.Scanner;
public class SumElementsArray 
{
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
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		System.out.println("the sum of all element in array is "+sum);
	}
}
