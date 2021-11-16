
public class M {
	public static void main(String[] args) {
//		System.out.println(5.4%5f);
//		float f=5.4f%5;
//		double d=5.4%5;
//		swap(2,3);
//		System.out.println(greatest(10,10,10));
//		System.out.println(checkAlphabet('a'));
//		lcm2();
		math();
		
	}
	static void swap(int a,int b) {
		System.out.println("before swapping\n a="+a+"\n"+" b="+b);
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("after swapping\n a="+a+"\n"+" b="+b);
	}	
	static int greatest(int a,int b,int c) {
		
		return a>b?(a>c?a:c):(b>c?b:c);
		
	}
	static boolean checkAlphabet(char c) {
		if(c>='A'&&c<='Z'||c>='a'&&c<='z')
		    return true;
		else 
			return false;
	}
	
	public static void lcm(){
	
		    int n1 = 72, n2 = 120, lcm;

		    // maximum number between n1 and n2 is stored in lcm
		    lcm = (n1 > n2) ? n1 : n2;

		    // Always true
		    while(true) {
		      if( lcm % n1 == 0 && lcm % n2 == 0 ) {
		        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
		        break;
		      }
		      ++lcm;
		      
		    }
	  }
	
	public static void lcm2(){
		
	    int n1 = 72, n2 = 120, lcm;
	    int g=n1>n2?n1:n2;
	    int s=n1<n2?n1:n2;
	    for(int i=1;true;i++) {
	      if( (g*i)%s==0) {
	        System.out.printf("The LCM of %d and %d is %d.", n1, n2, g*i);
	        break;
	      }	      
	   }
  }
	
	public static void gcf() {
			    // find GCD between n1 and n2
			    int n1 = 81, n2 = 153;
			    
			    // initially set to gcd
			    int gcd = 1;

			    for (int i = 1; i <= n1 && i <= n2; ++i) {

			      // check if i perfectly divides both n1 and n2
			      if (n1 % i == 0 && n2 % i == 0)
			        gcd = i;
			    }

			    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
	
	public static void math() {
		System.out.println(Math.pow(2,3));
		System.out.println(Math.min(4,Math.min(2,1)));
		
	}
	
}


