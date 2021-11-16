package ProgramsOnArray;

public class SecondGreatest {
	public static void main(String[] args) {
	int[] a= {4,5,3,9,10,13,11};
	int fbig=a[0];
	int sbig=a[1];
	for(int i=1;i<a.length-1;i++) 
	{
		if(fbig<a[i]) 
		{
			sbig=fbig;
			fbig=a[i];
		}
		else if(sbig>a[i])
		{
			sbig=a[i];
		}
	}
	System.out.println("biggest number is:"+fbig);	
	System.out.println("second biggest number is:"+sbig);	
	}
}
