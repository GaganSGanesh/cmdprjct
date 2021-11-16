
public class EqualHomeRunner extends Home {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		Home h1=new Home("red",5,20);
		Home h2=new Home("blue",5,10);
		Home h3=new Home(5,10,"blue");
		System.out.println(h1.equals(h2));
		System.out.println(h2.equal(h3));
		Home h4=new Home(8);
		Home h5=new Home(8);
		System.out.println(h4.hashCode());
		System.out.println(h4.hashCode()==h5.hashCode());
	}

}
