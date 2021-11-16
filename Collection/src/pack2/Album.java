package pack2;
import java.util.ArrayList;
import java.util.Scanner;
public class Album {
public static void main(String[] args) {
	ArrayList album=new ArrayList();
	album.add(new Song("thoda thoda pyar hua","jubin"));
	album.add(new Song("besabriya","Armaan Malik"));
	album.add(new Song("namo namo","unknown"));
	System.out.println(album);
/*  It is like creating song a=new song() and storing variable in ArrayList of album...
 *  it calls a.toString() of song class......new Song("thoda","jubin").toString */
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter a song name");
	String s1=s.nextLine().trim().toLowerCase();
	
	boolean found=false;
	for(Object o:album)
	{
		Song s2=(Song)o;
		if(s2.title.equals(s1))
		{
			    
		}
	}
}
}
