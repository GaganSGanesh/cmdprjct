import java.util.Scanner;

public class AddAnElement {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a= {23,12,14,56,22,28,13,0};
		System.out.println("enter index number");
		int index=s.nextInt();
		System.out.println("enter number");
		int no=s.nextInt();
		int lind=a.length-1;
		for(int i=lind;i>index;i--){
			a[i]=a[i-1];
		}
		a[index]=no;
		for(int j:a) {
			System.out.print(j+" ");
		}
	}
}
