//shifting left
import java.util.Scanner;  
public class DeletingElement {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size or how many no you want in array");
	int size=sc.nextInt();
	System.out.println("enter numbers in array");
	int[] a=new int[size];
	for(int j=0;j<size;j++)
	{
		a[j]=sc.nextInt();
	}
	System.out.println("type index you want to delete");
	int index=sc.nextInt();
	for(int i=index;i<size-1;i++)
		a[i]=a[i+1];
	for(int i:a)
		System.out.print(i+" ");
}
}