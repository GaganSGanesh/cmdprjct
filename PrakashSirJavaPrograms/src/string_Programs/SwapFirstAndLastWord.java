package string_Programs;

public class SwapFirstAndLastWord {
	public static void main(String[] args) {
		String s="Hello this is java class is this java class";
		String[] a = s.split(" ");
		
		String temp=a[0];
		a[0]=a[a.length-1];
		a[a.length-1]=temp;
		
		String b="";
		for(String c:a) {
			b=b+" "+c;
		}
		s=b.trim();
		System.out.println(s);
	}
}
