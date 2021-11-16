public class Array 
{
//	    int [5]a; wrong
		int[] a;
		int b[];
		int []c;
//		int[] d=new int[];//at the time of constructor declaration no size then error 
	
	public static void main(String[] args) 
	{
		int[] d=new int[3];
		d[0]=1;
		d[1]=2;
		d[2]=2;
		System.out.println(d[2]);
	}
}
