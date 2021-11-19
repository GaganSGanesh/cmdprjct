package String_2.O;

public class Replace_i_With_a {

	public static void main(String[] args) {
		String s="india";
		char[] a = s.toCharArray();
		for (int i=0;i<a.length;i++) {
			if(a[i]=='i')
				a[i]='a';		
			}
		s=new String(a);
		System.out.println(s);
	}
}
