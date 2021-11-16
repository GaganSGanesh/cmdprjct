package Date_28_09;
		
public class Word_Count {
		
	public static void main(String[] args) {
		String s="java hi java hello this is Milu java no no jva JAVA pythonjava";
		System.out.println(s.contains("java"));
		int count = 0;
		for(int i=0,j=4;j<=s.length();i++,j++) {
		String s1=s.substring(i,j);
		if(s1.equalsIgnoreCase("java")) {
			count++;
	     	}
		}
		System.out.println(count);
	}
}

class Word{
	public static void main(String[] args) {
		String s="java ruby jAvA python JavA selenium java";
		String[] array = s.split(" ");
		int count=0;
		int word=0;
		for (String string : array) {
			word++;
			if(string.equalsIgnoreCase("java"))
				count++;
		}
		System.out.println("no. of word present in paragraph is "+word);
		System.out.println("no. of java present in paragraph is "+count);
		
	}
}

class Word2{
	public static void main(String[] args) {
		String s="java ruby jAvA python JavA selenium java";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("number of words "+ ++count);
		
	}
}


