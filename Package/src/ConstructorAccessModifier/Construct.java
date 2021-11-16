package ConstructorAccessModifier;

class Construct extends constr {
	
	public Construct() {
		super(a);
	}
	
	public static void main(String[] args) {
		
		
	}
}
class constr {
	static int a;
	private constr()
	{}
	public constr(int a)
	{}
	public static void main(String[] args) {
		
	}
	
}