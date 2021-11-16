package package1;

public class BD1 {

	public static void main(String[] args) {
		Book b=new Book(1,234.5);
		Book b1=b;
		System.out.println(b);
		System.out.println("b.hashCode()"+b.hashCode());
		System.out.println("b1.hashCode()"+b1.hashCode());
		System.out.println("b.equals(b1):"+b.equals(b1));
		System.out.println("b.hashCode()==b1.hashCode()"+(b.hashCode()==b1.hashCode()));
	}

}
