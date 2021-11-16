package ProgramsOnArray;
import java.util.Scanner;
public class InsertAnElementInSpecifiedIndex {
	public static void main(String[] args) {
	int[] a= {12,33,45,6,14,23,6,0,0};
	Scanner s=new Scanner(System.in);
	System.out.println("enter key and index");
	int key=s.nextInt();
	int index=s.nextInt();
	
	for(int i=a.length-1;i>index;i--)
	{
		a[i]=a[i-1];
	}
	a[index]=key;
	for(int i:a)
	{
		System.out.print(i+" ");
	}
	}
}
