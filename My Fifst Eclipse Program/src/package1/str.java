package package1;
class C{}

public class str
{
	static str s;
	static str t;
	public static void main(String[] args) 
	{
		String s1=new String("milu");
		String s2=new String("milu");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("=============");
		int a=2,b=2;
		System.out.println(a==b);//not for the primitive data type may be
		System.out.println("==============");
		System.out.println(s==t);
		System.out.println("==============");
		String s3="Bangalore";
		System.out.println(s3.concat(" karnataka"));
		System.out.println(s3.length());
		System.out.println(s3.charAt(0));
		System.out.println(s3.substring(3,8));
		System.out.println(s3.substring(0,2));
		System.out.println(s3.substring(1,2));
//		System.out.println(s3.substring(3,10));
		System.out.println(s3.isEmpty());
		System.out.println(s3.indexOf(a));
		System.out.println(s3.contains("ang"));
		System.out.println(s3.replace('a', 'b'));
		System.out.println(s3.compareTo(s1));
		System.out.println("hello".compareTo("hello123"));
		System.out.println("my native is\n".concat(" Odisha"));
		String s4="Steven Smith";
		System.out.println(s4.substring(7));
		s4="my name is biswajit samal";
		System.out.println(s4.substring(11,19));
//		System.out.println(s4.substring(0,200));
        String s5="my name is virat";
        System.out.println(s5.substring(11,16));
		String ss="bengaluru";
		String ss1="";
		System.out.println(ss.indexOf("luru",4));
		System.out.println(ss.indexOf("luru",10));
		System.out.println(ss1.isEmpty());
		System.out.println(ss.indexOf("neg"));
		System.out.println(ss.contains("riv"));
		String s6="   1 samarat   ";
		System.out.println(s6.trim());
		
	}

}
