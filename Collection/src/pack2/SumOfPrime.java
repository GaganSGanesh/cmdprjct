package pack2;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPrime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter m and n");
    int m=sc.nextInt();
    int n=sc.nextInt();
    ArrayList a=genPrime(m,n);
    int sum=0;
    for(Object o:a) 
    {
    	int temp=(Integer)o;
    	sum=sum+temp;
    }
    System.out.println("the sum of prime numbers is:"+sum);
}
	static ArrayList genPrime(int m,int n){
		ArrayList prime=new ArrayList();
		for(int i=m;i<=n;i++) {
		if(isPrime(i))
		{
			prime.add(i);
		}
		}
		return prime;
	}
	static boolean isPrime(int n){
		if(n==1||n==0)
			return false;
		else {
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
			
		}
		}
		return true;
	}
}
