import java.util.Scanner;
public class SmallestLargestInArray 
{
	public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter numbers in array");
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)	
	     	{
				if(a[i]>a[j])
				{	count++; }
					
		    }
			if(count==(a.length-1))
				System.out.println(a[i]+" is greatest");
		}
		System.out.println("=====================");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)	
	     	{
				if(a[i]<a[j])
				{	count++; }
					
		    }
			if(count==(a.length-1))
				System.out.println(a[i]+" is smallest");
		}

    }
}
