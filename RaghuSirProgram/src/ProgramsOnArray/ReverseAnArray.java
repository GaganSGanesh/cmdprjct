package ProgramsOnArray;

public class ReverseAnArray {
public static void main(String[] args) {
	int[] a= {12,33,45,6,14,23,6};
	int n=a.length;
	for(int i=0;i<n/2;i++)		
	{
		int temp=a[i];
		a[i]=a[n-i-1];
		a[n-i-1]=temp;
	}
	System.out.println("reverse of the array is ");
	for(int i:a)
	{
		System.out.print(i+" ");
	}
}
}
