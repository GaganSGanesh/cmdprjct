abstract class car{
	int wheel;
	String clr;
	car(int wheel,String clr)
	{
		this.clr=clr; this.wheel=wheel;
		System.out.println("this is car class constructor");
	}
}
class Maruti extends car{
	Maruti()
	{
		super(4,"red");
		System.out.println("this is maruti class constructor");
	}
}
class Runner 
{
	public static void main(String[] args) {
	Maruti m=new Maruti();
	car c=m;
//	System.out.println(m.clr+" "+m.wheel);
	System.out.println(c.clr+" "+c.wheel);
	}
}


