package pack1;

import java.util.ArrayList;

public class Bag {
public static void main(String[] args) {
	ArrayList bag=new ArrayList();
	bag.add(new Book("Java","sumanth"));
	bag.add(new Book("Manual","Ramya"));
	bag.add(new Book("Sql","Riza"));
	System.out.println(bag);
	System.out.println((Book)bag.get(2));
			
}
}
