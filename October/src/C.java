
interface A {
	
}
interface B{
	
}
class C implements A,B{
	
	public static void main(String[] args) {
		A a=new C();
		B b=(B)a;
	}
}
