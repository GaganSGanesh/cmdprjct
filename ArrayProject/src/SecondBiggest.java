import java.util.Scanner;

public class SecondBiggest {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many no. you want in array");
		int size=sc.nextInt();
		int[] a=new int[size+1];
		System.out.println("enter numbers in array");
		for(int j=0;j<size;j++)
		{
			a[j]=sc.nextInt();
		}
		int fbig=a[0],sbig=a[1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>fbig) {
				sbig=fbig;
				fbig=a[i];
			}
			else if(a[i]>sbig) {
				sbig=a[i];
			}
		}
		System.out.println("biggest is:"+fbig+" second biggest is "+sbig);
		
	}
}

