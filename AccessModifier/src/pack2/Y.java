package pack2;
import pack1.c1;
import pack1.AccMod;

public class Y extends c1{
	public void meth() {      //p and z are not inherited to sub class different package
		System.out.println(x);
		System.out.println(y);
		System.out.println(z); //default
		System.out.println(p); //private
	}
	public static void main(String[] args) {
		c1 cc=new c1();
		cc.y=9;//protected
		cc.x=2;//public
		cc.z=1;//default
		cc.p=4;//private
		
		
		Y y=new Y();
		y.y=10;
		y.x=2;
		y.z=9;
		y.p=5;
		
		
		
		}
}
