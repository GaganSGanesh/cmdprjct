import java.util.Scanner;
public class StoreAsciOfCharacter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		System.out.println("enter characters in array");
		char [] c=new char[n];
		int[] d=new int[n];
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.next().charAt(0);
			d[i]=c[i];
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]+" ");
		}
	}
}
