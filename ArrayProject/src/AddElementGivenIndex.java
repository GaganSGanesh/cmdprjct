import java.util.Scanner;         //shifting right from special index
public class AddElementGivenIndex //assigning a number at that index
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no. you want in array");
		int no=sc.nextInt();
		System.out.println("enter numbers in array");
		int[] a=new int[no+1];
		for(int j=0;j<no;j++)
		{
			a[j]=sc.nextInt();
		}
		System.out.println("type which no. you want to add");
		int key=sc.nextInt();
		System.out.println("type index at which you want to add");
		int index=sc.nextInt();

		while(no-1>=index)
		{
			a[no]=a[no-1];
			no--;
		}
		a[index]=key;
		for(int i:a)
		{ System.out.print(i+" ");}
	}

}






