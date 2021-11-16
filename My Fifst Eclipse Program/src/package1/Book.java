package package1;

public class Book {
	int bid;
	double price;
	Book(int bid,double price)
	{
		this.bid=bid;
		this.price=price;
	}
	public String toString()
	{
		return "bid:"+bid+"/n"+"price"+price;
		
	}
	public boolean equals(Object o)
	{
		Book b=(Book)o;
		if(this.bid==b.bid && this.price==b.price)
			return true;
		return false;
	}
	public int hashCode()
	{
		int hc=0;
		hc=hc+(int)price;
		return hc;
	}
}

