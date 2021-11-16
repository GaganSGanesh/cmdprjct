package pack2;
import java.util.ArrayList;
public class Song {
	String title;
	String artist;
	Song()
	{}
	Song(String title,String artist)
	{
		this.title=title;
		this.artist=artist;
	}
	Song(String title)
	{
		this.title=title;
	}
	public String toString()
	{
		return title;
	}	
}

