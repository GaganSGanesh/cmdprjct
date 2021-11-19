package String_2.O;

public class Replace_co_With_oc {

	public static void main(String[] args) {
		String s="welcomco";
		char[] a = s.toCharArray();
		for (int i=0;i<a.length-1;i++) {
			if(a[i]=='c'&&a[i+1]=='o') {
				a[i]='o';		
     			a[i+1]='c';		
			}
		}
		
		s=new String(a);
		System.out.println(s);
	}
}
