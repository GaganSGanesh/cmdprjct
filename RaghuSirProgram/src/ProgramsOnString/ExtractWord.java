package ProgramsOnString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExtractWord {
	public static void main(String[] args) {
		String s="Hello Biswajit This is Eclipse Software";
		String rev="";
		String[] a = s.split(" ");
//		System.out.println(Arrays.toString(a));
		List<String> list = Arrays.asList(a);   
		Collections.reverse(list);
		list.toArray(a);
//		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			rev=rev+" "+a[i];
		}
		rev=rev.trim();
		System.out.println("reverse of the string is \n"+rev);
		
	}
}

class rev{
	public static void main(String[] args) {
		String s="Hello Biswajit This is Eclipse Software";
		String rev="";
		String[] a = s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			for(int j=a[i].length()-1;j>=0;j--) {
			rev=rev+a[i].charAt(j);
			}
		a[i]=rev;
		rev="";
		}
		System.out.println("reverse of the string is \n"+Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			rev=rev+" "+a[i];
		}
		System.out.println(rev.trim());
	}
}
class rev2{
	public static void main(String[] args) {
		String s = " I live in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());
	}
}