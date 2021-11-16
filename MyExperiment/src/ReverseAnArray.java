
public class ReverseAnArray {
	public static void main(String[] args) {
		int[] a = { 7, 4,8,12,3};
		int lastIndex=a.length-1;
		for(int i=0;i<a.length/2;i++) //common mistake i<=a.length/2
		{
			int temp=a[i];
			a[i]=a[lastIndex-i];
			a[lastIndex-i]=temp;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}
