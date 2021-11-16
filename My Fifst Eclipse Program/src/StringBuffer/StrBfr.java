package StringBuffer;
import java.util.Scanner;
public class StrBfr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String s=sc.nextLine();
		System.out.println("enter Boy:1 , Girl:2 ,Married Man:3 ,Married Woman:4 ");
		int a=sc.nextInt();
		StringBuffer b=new StringBuffer(s);
		StringBuffer b1=new StringBuffer("master.");
		StringBuffer b2=new StringBuffer("mr.");
		StringBuffer b3=new StringBuffer("mrs.");
		switch(a)
		{
		case 1:
		case 2:
			System.out.println(b1.append(s));
	        break;
/*		case 3:
			System.out.println(b2.append(s));		}
		    break;*/
		case 3:System.out.println(b2.append(s));
		        break;
		case 4: System.out.println(b3.append(s));
	         	break;
		default:
		System.out.println("enter a valid input");
	
        }
	}
}


