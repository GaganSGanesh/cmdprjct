package string_Programs;

public class Swap{
	
	public static void main(String[] args) {
		String s1="tyss";
		int i=s1.length();//4
		String s2="qsp";
//		System.out.println(s1+s2);
		s1=s1+s2;
		s2=s1.substring(0,i);//0 TO 3
		s1=s1.substring(i);
		System.out.println(s2);
		System.out.println(s1);
	}
}

class Swap2{
	
	public static void main(String[] args) {
		String s1="tyss";
		String s2="qsp";
		System.out.println("Before swapping");
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());

		System.out.println("After swapping");
		System.out.println(s1);
		System.out.println(s2);
	}
}
