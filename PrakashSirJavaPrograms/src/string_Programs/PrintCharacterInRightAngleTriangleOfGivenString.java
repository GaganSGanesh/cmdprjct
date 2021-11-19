package string_Programs;

public class PrintCharacterInRightAngleTriangleOfGivenString {
	public static void main(String[] args) {
		String s="Biswajit";
		String var="";
		for(int i=0;i<s.length();i++) {
			var=var+s.charAt(i);
			System.out.println(var);
		}
	}
}
