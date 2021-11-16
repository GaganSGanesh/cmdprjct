
public class BiggestAndSmallestInArray {
	public static void main(String[] args) {
		int[] a= {23,12,14,56,22,28,13};
		int biggest=a[0];
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>biggest)
				biggest=a[i];
			if(a[i]<smallest)
				smallest=a[i];
		}
		System.out.println("biggest is :"+biggest);
		System.out.println("smallest is :"+smallest);
		
	}
}
