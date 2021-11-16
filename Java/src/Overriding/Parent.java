package Overriding;

public class Parent {
	public Parent m() {
		return null;
		
	}
}
class Child extends Parent{
	@Override
	public Child m() {
		return null;
		
	}
}