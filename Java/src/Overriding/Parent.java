package Overriding;

public class Parent {
	static Parent p=new Parent();
	public Parent m() {
		return p;
		
	}
	
	public Object n() {
		return new Object();
	}
	
	public int o() {
		return 0;
	}
	
}
class Child extends Parent{
	static Child c=new Child();
	@Override
	public Child m() {
		return c;
	}
	@Override
	public String n() {
		return new String();
	}
//	@Override
//	public short o() {
//		
//	}
	
}