package string_Programs;

public class PrintCharacterInRightAngleTriangleOfGivenString {
	public static void main(String[] args) {
		String s="Biswajit";
		String reverse="";
		for(int i=0;i<s.length();i++) {
			reverse=reverse+s.charAt(i);
			System.out.println(reverse);
		}
	}
}
