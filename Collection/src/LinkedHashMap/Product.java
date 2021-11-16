package LinkedHashMap;
import java.util.*;
import java.util.Map.Entry;
public class Product {
	public static void main(String[] args) { 
		Map<Integer,String>indmap=new LinkedHashMap<>();
		indmap.put(171, "Dohni");//171 auto boxed to object
		
		indmap.put(82, "Virat");
		indmap.put(10, "Rohit");
		System.out.println("Iterating Map using entrySet()");
		Set<Entry<Integer,String>> set=indmap.entrySet();
		for(Entry<Integer,String> entry:set) {
			System.out.println(entry);
		}
		Set<Integer> a = indmap.keySet();
		for(Integer i:a) {
			System.out.print(i+" ");
		}
		Collection<String> b = indmap.values();
		for(String s:b) {
			System.out.print(s+" ");
		}
	}
}
