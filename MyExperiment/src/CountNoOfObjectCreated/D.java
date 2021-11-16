package CountNoOfObjectCreated;
class A {
	static int count1=0;
	int var;
	A(){
		count1++;
		var++;
	}
}

class D extends A {
	static int count2=0;
	D(){
		count2++;
	}
	public static void main(String[] args) {
		
	}	
}

class E extends D{
	static int count3=0;
	E(){
		count3++;
	}
	public static void main(String[] args) {
		E e1=new E();
		E e2=new E();
		System.out.println(count1+"\n"+count2+"\n"+count3);
		System.out.println(e2.var);
	}
	
}
