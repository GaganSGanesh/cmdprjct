
public class Find_First_Largest_And_Second_Largest {
	public static void main(String[] args) {
		int[] a= {23,12,14,56,22,28,13};
		int flarg=a[0];
		int slarg=a[1];
		for(int i=0;i<a.length-1;i++){
			if(flarg<a[i+1]) {
				flarg=a[i+1];
				slarg=a[i];
			}
//			else if (slarg<a[i])
//			{
//			slarg=a[i];
//			}
		}
		System.out.println(flarg);
		System.out.println(slarg);
	}
}
class Fbiggest
{
	public static void main (String [] args)
	{
		int ar[]={23,12,14,56,22,28,13};
		int fbig=ar [0];
		int sbig=ar [1];
		for (int i=1; i<ar.length; i++)
		{
			if (fbig<ar[i])
			{
				sbig=fbig;
				fbig=ar[i];
			}
			else if (sbig<ar[i])
			{
				sbig=ar[i];
			}
		}
		System.out.println ("first biggest element is "+fbig);
				System.out.println ("second biggest element is "+sbig);
	}
}
