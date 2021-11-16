import java.util.Arrays;
import java.util.Collections;

public class Sort_A_String {
	public static void main(String[] args) {
		String s="i am devil";
		char[] c = s.toCharArray();
		Character[] ch=new Character[c.length];
		for(int i=0;i<c.length;i++) {
			ch[i]=c[i];
		}
		Arrays.sort(ch);
		for(int i=0;i<c.length;i++) {
			c[i]=ch[i];
	 }
		s=new String(c);
		System.out.println(s.trim());
	}	
}
