package DayBeforeMock;

public class Charecter {
	public static void main(String[] args) 
	{
		char ch=65;  // compiler implicitily do type casting
		System.out.println(ch);
		char ch1=(char) 65.0;
		System.out.println(ch);
		char ch2=(char) 65;
		System.out.println(ch2);
		
	}

}
