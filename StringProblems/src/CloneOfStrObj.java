
public class CloneOfStrObj
{
	public static void main(String[] args) 
	{
		String s="Milu";
		String s1=new String(s);
		String s2=new String(s);	
		System.out.println(s1.equals(s2));
	}
}
