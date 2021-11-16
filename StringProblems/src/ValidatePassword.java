import java.util.Scanner;
public class ValidatePassword
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a password:");		
		String s=sc.nextLine();
		String s1="";
		if(!(s.charAt(0)>='A'&&s.charAt(0)<='Z'&&s.charAt(0)>='a'&&s.charAt(0)<='z'&&s.charAt(0)>='0'&&s.charAt(0)<='9'))
		{	System.out.println("not a valid password");}
		if(s.length()<=8)
			{System.out.println("not a valid password");}
		int noOfDig=0;
		int countSpace=0;
		int countDigit=0;
		int countSpecialChar=0;//>=1
		int countUpperCase=0;//>=1
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)>='A'&&s.charAt(j)<='Z')
			     countUpperCase++;
			if(s.charAt(j)==' ')
				countSpace++;
			if(!(s.charAt(0)>='A'&&s.charAt(0)<='Z'&&s.charAt(0)>='a'&&s.charAt(0)<='z'&&s.charAt(0)>='0'&&s.charAt(0)<='9'))
				countSpecialChar++;
			if(s.charAt(j)>='0'&&s.charAt(j)<='9')
				countDigit++;
		}
		if(countSpace>=1)
			{System.out.println("not a valid password: there should no space");}
		if(countDigit==0)
			{System.out.println("not a valid password: there should be at least one digit");}
		if(countUpperCase==0)
				{System.out.println("not a valid password:it shuld have at least one upper case");}
		if(countSpecialChar==0)
			{System.out.println("not a valid password:at least one special character");}
	}
}
