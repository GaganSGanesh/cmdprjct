package ProgramsOnString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Annagram {
	public static void main(String[] args) {
		String s="si con li";
		String s2="silicon";
		ArrayList<Character> al=convert(s);
		ArrayList<Character> al2=convert(s2);
		Collections.sort(al);
		Collections.sort(al2);
		if(al.size()!=al2.size()){
			System.out.println("not annagram");
		}
		else{
			for (int i=0;i<al.size();i++) {
				if(al.get(i)==al2.get(i))
				{
					if(i==al.size()-1)
						System.out.println("it is annagram");
				}
				else{
					System.out.println("not annagram");
					break;
				}
			}
		}
		
			}
	
	public static ArrayList convert(String s){
		s=s.trim();
		ArrayList<Character> al=new ArrayList<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ')	//remove spaces
				al.add(s.charAt(i));
		}
		return  al;
	}

}
class Annagram2{
	public static void main(String[] args) {
		String s1=" Mother in law ";
		String s2=" Hitler woman ";
		s1=s1.trim().toLowerCase().replaceAll(" ","");
		s2=s2.trim().toLowerCase().replaceAll(" ","");

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		for(int i=0,j=0;i<s1.length();i++,j++){
			if(a1[i]==a2[j]){
				if(i==a1.length-1)
					System.out.println("annagram");
			}
			else{
				System.out.println("not annagram");
			}
		}
	}
}










