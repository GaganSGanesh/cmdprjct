import java.util.Scanner;

public class ArrayLargest {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no. you want in array");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter numbers in array");
		for(int j=0;j<size;j++)
		{
			a[j]=sc.nextInt();
		}
		int largest=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>largest)
				largest=a[i];
		}
		System.out.println("largest number is:"+largest);
}
}
