package string_Programs;

public class Separate_AlphabetNumberAndSpecialCharacter {
	public static void main(String[] args) {
		String s="67 this@is_my&Name*";
		String alpha="";
		String number="";
		String spChar="";
		
		for(int i=0;i<s.length();i++) {
			
//			if(s.charAt(i)>=65&&s.charAt(i)<=90||s.charAt(i)>=97&&s.charAt(i)<=122)
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='a'&&s.charAt(i)<='z')
				alpha=alpha+s.charAt(i);
			else if(s.charAt(i)>=48&&s.charAt(i)<=57)
				number=number+s.charAt(i);
			else
				spChar=spChar+s.charAt(i);
		}
		System.out.println(alpha+"\n"+number+"\n"+spChar);
	}
}
class SumOfNumbersInString{
	public static void main(String[] args) {
		String s="67 this@is_my&Name*";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
				sum=sum+s.charAt(i)-48;
		
		}
		System.out.println(sum);
	}	
}

class Vowel {
	public static void main(String[] args) {
		String s="67 this@is_my&Name*";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'/**||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'*/)
				System.out.println(s.charAt(i));
		}
	}
}
