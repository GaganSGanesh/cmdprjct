import java.util.Scanner;
public class CheckPallindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a name ");		
		String s=sc.nextLine();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println("the original string is "+s);
		System.out.println("the reversed string is "+s1);

		if(s.equals(s1))
			System.out.println("pallindrome");
		else
			System.out.println("not a pallindrome");
	}
}
	class CheckPallindromeString2{
		public static void main(String[] args) {
			boolean isPallindrome=true;
			String s="Malayalam";
			for(int i=0;i<s.length()/2;i++)
			{
				if(s.charAt(i)==s.charAt(s.length()-1-i)||s.charAt(i)==s.charAt(s.length()-1-i)+32||s.charAt(i)==s.charAt(s.length()-1-i)-32){
					
				}
				else{
					isPallindrome=false;
				}			
			}
			
			System.out.println("isPallindrome: "+isPallindrome);
		}		
	}