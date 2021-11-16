
public class Strong_Number {
	public static void main(String[] args) {
		int no=145;
		int temp=no;
		int sum=0;
		while(no>0) {
			int d=no%10;
			int fact=1;
			for(int i=d;i>0;i--) {
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(temp==sum)
		System.out.println("strong number\n"+temp);
	}
}
