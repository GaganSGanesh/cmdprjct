import java.util.Arrays;

public class Test {
	static Emp a;
	public static void main(String[] args) {
		Emp e1=new Emp(111,"Ratan");
		Emp e2=new Emp(222,"anu");
		Emp e3=new Emp(333,"durga");
		
		Emp[] e=new Emp[5];
		e[0]=e1;
		e[2]=e2;
		e[4]=e3;
//		System.out.println(e[1].toString()); NPE
//		System.out.println(a.toString());    NPE
		System.out.println(Arrays.toString(e));//if any null then null is returned else address.toString()
	}
}
class Emp{
	int eid;
	String ename;
	Emp(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	public String toString() {
		return eid+" "+ename;
	}
}