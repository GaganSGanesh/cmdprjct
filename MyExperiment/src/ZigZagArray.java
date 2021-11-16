
public class ZigZagArray {

	public static void main (String [] args)
	{
	int ar1 [] = {12, 13, 23, 15, 11, 16};
	int ar2[]={53,26,23,15,18,13,23,45};
	int res [] =new int [ar1.length+ar2.length];
	int j=0;
	int k=ar1.length+ar2.length;
	for(int i=0;i<k;i++) {
		if(i%2==0&& i<ar1.length)
			res[i]=ar1[i];
		else if(i%2!=0 && i<ar1.length) {
			res[i]=ar2[j];
			j++;
		}
	}
	for(int a:res)
		System.out.print(a+" ");
}
}

class Zigzag
{
	public static void main (String [] args)
	{
		int ar1 [] = {12, 13, 23, 15, 11, 16};
		int ar2[]={53,26,23,15,18,13,23,45};
		int res [] =new int [ar1.length+ar2.length];
		int i=0, j=0;
		for (int k = 0; k < res.length; )
		{
			if (i<ar1.length)
			{
				res[k] =ar1 [i];
				i++;
				k++;  //1 3 5 7
			}
			if (j<ar2.length)
			{
				res[k] =ar2 [j];
				j++;
				k++;  //2 4 6 8
			}
		}
		System.out. println ("ZIGZAG ARRAY IS");
		for (int l:res)
		{
			System.out. print (l+" ");
		}
	}
}
