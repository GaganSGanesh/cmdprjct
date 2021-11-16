
public class MissingElementInSortedArray{
	public static void main(String[] args) {
		int a [] = {8, 15, 21, 24, 30, 37};
		for(int i=0;i<a.length-1;i++)
		{
		for(int j=a[i]+1;j<a[i+1];j++) 
			System.out.print(j+" ");
	    }
		
	}
}
class Exchangeofelements
{
	public static void main (String [] args)
	{
		int ar[]={21,12,15,32,16,17,22};
		System.out.println ("BEFORE EXCHANGE OF ARRAY");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println (ar[i]);
		}
		int n;
		if (ar.length%2==0)
			n=ar.length/2;
		else
			n= (ar.length/2) +1;
		for (int i=0; i<ar.length/2; i++)
		{
			int t=ar[i];
			ar[i] =ar [n+i];
			ar [n+i]=t;
		}
		System.out.println ("AFTER EXCHANGE OF ARRAY");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println (ar[i]);
		}
	}
}
