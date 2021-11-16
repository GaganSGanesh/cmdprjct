class D {
	
}
class E extends D{
	
}
class F extends E{
	public static void main(String[] args) {
		F f=new F();
		E e=(E)f;
	}
}
