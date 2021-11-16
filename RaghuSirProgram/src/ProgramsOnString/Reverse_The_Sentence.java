package ProgramsOnString;

import java.util.Scanner;

class rev3{
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

public class Reverse_The_Sentence {
	public static void main(String[] args) {
		String sc="Rama and Laxman";
		String s="";
		String s1="";
		int j;
		int k=0;
		for(int i=0;i<3;i++) {  //no of words=spaces + 1 =(3)
		for(j=k;j<sc.length();j++) {
			if(sc.charAt(j)!=' ') {
				s=s+sc.charAt(j);
			}
			else {
				s=" "+s;
				k=j+1;
				break;
			}
		  }
		s1=s+s1;
		s="";
		}
		s1=s1.trim();
		System.out.println(s1);
	}
}

class Revsentence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		String rst=" ";
		for (int i=ch.length-1;i>=0 ;i-- )
		{
			int k=i;
			while (i>=0&&ch [i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while ( j<=k)
			{
				rst =rst +ch[j];
				j++;
			}
			rst=rst+' ';
		}
		System.out.println("The reserve sentence is:"+rst);
	}
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Original string : ");
 
        String originalStr = scanner.nextLine();
        scanner.close();
 
        String words[] = originalStr.split(" ");
        String reversedString = "";

        //Reverse each word's position
        for (int i = 0; i < words.length; i++) { 
            if (i == words.length - 1) 
                reversedString = words[i] + reversedString; 
            else
                reversedString = " " + words[i] + reversedString; 
        } 
 
        // Displaying the string after reverse
        System.out.print("Reversed string : " + reversedString);
    }
}

