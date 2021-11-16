package ProgramsOnArray;

public class FindGcd {
public static void main(String[] args) {
	int x = 12, y = 8, gcd = 1;  
	for(int i = 1; i <= x && i <= y; i++)  
	{  
	if(x%i==0 && y%i==0)  	//returns true if both conditions are satisfied   

	gcd = i;  	//storing the variable i in the variable gcd  
	
	}
	
	System.out.printf("GCD of %d and %d is: %d", x, y, gcd);  
}
}
class FindGCD
{   
public static void main(String[] args)   
{   
int a = 54, b = 24;   
System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));   
}   
//recursive function to return gcd of a and b   
static int gcd(int a, int b)   
{   
// Everything divides 0   
if (a == 0)   
return b;   
if (b == 0)   
return a;   
if (a == b)   
return a;   
if (a > b)   
return gcd(a-b, b);   
return gcd(a, b-a);   
}   
}  