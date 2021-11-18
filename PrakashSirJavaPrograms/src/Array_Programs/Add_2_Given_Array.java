package Array_Programs;

public class Add_2_Given_Array {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20};
		int[] b= {30,10,40,60,20,50,70,80};
		if(a.length>b.length) {
			int[] c=new int[a.length];
			for(int i=0;i<b.length;i++) {
				c[i]=b[i];		
			}			
			for(int i=0;i<c.length;i++) {
				System.out.println( c[i]+a[i]);	
			}			
		}
		else {
			int[] c=new int[b.length];
			for(int i=0;i<a.length;i++) {
				c[i]=a[i];				
			}
			for(int i=0;i<c.length;i++) {
				System.out.println( c[i]+b[i]);	
			}
		}
	
	}

}

class Add_2_Given_Array2 {

	public static void main(String[] args) {
		int[] a= {30,10,40,60,20};
		int[] b= {30,10,40,60,20,50,70,80};
		if(a.length>b.length) {
			for(int i=0;i<a.length;i++) {
				if(i<b.length)
				System.out.println( a[i]+b[i]);	
				else		
					System.out.println(a[i]);	
			}							
		}
		else {
			for(int i=0;i<b.length;i++) {
				if(i<a.length)
				System.out.println( a[i]+b[i]);	
				else		
					System.out.println(b[i]);	
			}			
	}
 }
}
