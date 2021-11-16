package Tue_21_09_2021;

import java.util.*;


public class Remove_Duplicate {
	public static void main(String[] args) {
		
		Integer[] i= {3,5,1,12,8};
		
		List<Integer> list = Arrays.asList(3,5,1,12,8,3);
		
		HashSet h=new HashSet(list);
		
		System.out.println(h);
		
		
	}
}
