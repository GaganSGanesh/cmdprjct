package Overriding;

public class Parent {
	public Parent m() {
		return null;
		
	}
	
	public Object n() {
		return null;
	}
	
	public int o() {
		return 0;
	}
	
}
class Child extends Parent{
	@Override
	public Child m() {
		return null;
	}
	@Override
	public String n() {
		return null;
	}
//	@Override
//	public short o() {
//		
//	}
	
}