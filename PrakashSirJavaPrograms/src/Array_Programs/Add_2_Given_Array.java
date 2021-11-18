package Array_Programs;

public class Add_2_Given_Array {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20,50};
		int[] b= {30,10,40,60,20,50,70,80};
		int gl=a.length>b.length?a.length:b.length;
		int sl=a.length<b.length?a.length:b.length;
		int[] c=new int[gl];
		
		
		
		for(int k=0;k<gl;k++) {
			if(k<=sl)
				c[k]=a[k]+b[k];
			else
				
			
		}

	}

}

