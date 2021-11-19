package string_Programs;

public class Sum {
	public static void main(String[] args) {
		String s="15ab25$x10a";
		int sum=0;
		int gnum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
				int n=s.charAt(i)-'0';
				gnum=gnum*10+n;
			}
			else {
				sum=sum+gnum;
				gnum=0;
			}
		}

		System.out.println("Sum is: "+(sum+gnum));

	}
}
