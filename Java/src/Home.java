import java.util.Scanner;
public class Home
{
	String clr;
	int flr;
	int room;
	Home(){}
	Home(int flr)
	{
		this.flr=flr;
	}
	Home(String clr,int flr,int room)
	{
		this.clr=clr;
		this.flr=flr;
		this.room=room;
	}
	Home(int flr,int room,String clr)
	{
		this.clr=clr;
		this.flr=flr;
		this.room=room;
	}
	public boolean equal(Object o)
	{
		Home h=(Home)o;
		if(this.clr==h.clr && this.flr==h.flr && this.room==h.room)
			return true;
		return false;
	}
	public int hashCode()
	{
		return flr;
	}
}
