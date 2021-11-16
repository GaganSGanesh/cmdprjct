package DayBeforeMock;
public class Check 
{
	static void factor(int a)
	{
		for(int i=1;i<=a/2;i++)
		{
		if(a%i==0)
			System.out.print(i+" ");	
		}	
	}
	static void primeOrComposite()
	{   
		int a=10;
		int count=0;
		for(int i=2;i<=a/2;i++)
		{
		if(a%i==0)
			count++;
		}	
		if(count>=1)
			System.out.println("composite number");
		else
			System.out.println("prime number");
	}
	static void perfectNumber()
	{
		int a=5;
		int sum=0;
		for(int i=1;i<=a/2;i++)
		{
		if(a%i==0)
			sum+=i;
		}	
		if(a==sum)
			System.out.println("perfect number");
		else
			System.out.println("Not a perfect number");
	}
	static int reverse(int a)
	{
		int reverse=0;
		while(a>0)
		{
		  int d=a%10;
		  reverse=reverse*10+d;
		  a=a/10;
		}
		return reverse;
	}
	static void pallindrome(int a)
	{
		if(a==reverse(a))
			System.out.println("pallindrome");
	}
	static int factorial(int i)
	{
		int fact=1;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
			return fact;
		
	}
	static int sumFactorial(int no)
	{
		int num=no;
		int sum=0;
		while(no>0)
		{
			int d=no%10;
			sum=sum+factorial(d);
			no=no/10;
		}
		return sum;
	}
	static void strongNumber(int no)
	{
		if(no==sumFactorial(no))
			System.out.println(no+" is strong number");
		else
			System.out.println(no+" is not a strong number");
	}
	public static void main(String[] args) 
	{
//		primeOrComposite();
//		perfectNumber();
//		factor(100);
		System.out.println("factorial is "+factorial(10));
		System.out.println("sum of factorial of all the digit is "+sumFactorial(1234));
		strongNumber(14);
	}
}




