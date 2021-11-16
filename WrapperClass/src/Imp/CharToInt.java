package Imp;

class Main {
	  public static void main(String[] args) {

	    // create char variables
	    char a = '9';
	    char b = '3';

	    // convert char variables to int
	    // by subtracting with char 0
	    int num1 = a - '0';
	    int num2 = b - '0';

	    // print numeric value
	    System.out.println(num1);    // 9
	    System.out.println(num2);    // 3
	  }
	}

class CharToInt{  
	public static void main(String args[]){  
		char c='1';  
		String s = String.valueOf(c); //primitive to string
		int a=Integer.parseInt(s);    //string to primitive  
		System.out.println(a);  
	}
}  

class CharToInt2 {
	public static void main(String[] args) {
			char c='1';  
			int a=Character.getNumericValue(c);  
			System.out.println(a);  
			}
	}

class CharToInt3 {
	public static void main(String[] args) {
			char c='1';  
			byte a=(byte)c;  
			System.out.println(a);  
		}
}