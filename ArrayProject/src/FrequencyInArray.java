import java.util.Scanner;

public class FrequencyInArray 
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
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			for(int j=0;j<s.length;j++)	
	     	{
				if(s[i]==s[j])
				{	
					count++; 
				}
					
		    }
				System.out.println("frequency of "+s[i]+" is "+count);
		}

	}

}
