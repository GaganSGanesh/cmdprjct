package HashMap;

import java.util.*;
public class Product {
	public static void main(String[] args) {
		Map<Integer,String> indmap = new HashMap<Integer, String>();
		indmap.put(7, "Dohni");
		indmap.put(8, "Virat");
		System.out.println(indmap);
		indmap.put(8, "Rohit");//replace
		System.out.println(indmap);
	}
}
/*
 * Output: {7=Dohni, 8=Virat} 
 *         {7=Dohni, 8=Rohit}
 */