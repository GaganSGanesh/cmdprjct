package ProgramsOnArray;

public class GreatestAndSmallestInArray {
public static void main(String[] args) {
	int[] a= {4,5,3,9,10,13,11};
	System.out.println(a);
	int fbig=a[0];
	for(int i=1;i<a.length-1;i++) 
	{
		if(a[i]>fbig)
			fbig=a[i];
	}
	System.out.println("biggest number is:"+fbig);
	int sml=a[0];
	for(int i=1;i<a.length-1;i++) 
	{
		if(a[i]<sml)
			sml=a[i];
	}
	System.out.println("smallest number is:"+sml);
	
}
}
