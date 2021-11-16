package MainMethod;
class A{
	public static void main(String[] a)
	{
		System.out.println("this is 1st main method in A class");
	}
	public static void main(String[] a,String[] b) {
		System.out.println("this is second main method in class A");
	}
}
class B extends A{
	public static void main(String[] b) {
		System.out.println("this is class B main method");
		A.main(null);
		A.main(null,null);
		main(null,null); 
		
	}
}
class CallMain {
	public static void main(String[] args) {
		B.main(args);
	}

}



