//shifting right from special index assigning a number at that index
import java.util.Scanner;      
public class AddElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no. you want in array");
		int size=sc.nextInt();
		System.out.println("enter numbers in array");
		int[] a=new int[size+1];
		for(int j=0;j<size;j++)
		{
			a[j]=sc.nextInt();
		}
		System.out.println("type which no. you want to add");
		int key=sc.nextInt();
		System.out.println("type index at which you want to add");
		int index=sc.nextInt();
		
		for(int i=size;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=key;
		for(int i:a)
		{ System.out.print(i+" ");}
	}

}
