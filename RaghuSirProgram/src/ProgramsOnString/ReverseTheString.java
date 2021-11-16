package ProgramsOnString;

public class ReverseTheString {
public static void main(String[] args) {
	String s="Biswajit Samal";
	
	char[] ch=s.toCharArray();
	int n=ch.length;
	for(int i=0;i<n/2;i++)
	{
		char temp=ch[i];
		ch[i]=ch[n-1-i];
		ch[n-1-i]=temp;
	}
			System.out.println(ch);
			System.out.println(ch.toString());
	String s1=new String(ch);
	System.out.println(ch);
}
}
