package LinkedHashMap;

import java.util.*;
import java.util.Map.Entry;

public class Product2 {
	public static void main(String[] args) {
		Map<Integer,String> indmap = new TreeMap<>();
		indmap.put(171, "Dohni");
		indmap.put(82, "Virat");
		indmap.put(10, "Rohit");
		indmap.put(12, "Sachin");
		indmap.put(19, "Raina");
		System.out.println(indmap);//default natural sorting
		
		System.out.println("Iterating Map using entrySet()");
		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set) {
			System.out.println(entry);
		}
//		new TreeMap(Comparator );

	}
}