package HashMap;
import java.util.*;
import java.util.Map.Entry;

public class Iterate_Using_EntrySet {
	public static void main(String[] args) {
		Map<Integer,String> indmap = new HashMap<Integer, String>();
		indmap.put(171, "Dohni");
		indmap.put(82, "Virat");
		indmap.put(10, "Rohit");
		System.out.println("Iterating Map using entrySet()");
		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set) {
			System.out.println(entry);
		}
	}
}