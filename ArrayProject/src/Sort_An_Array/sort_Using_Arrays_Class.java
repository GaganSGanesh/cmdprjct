package Sort_An_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sort_Using_Arrays_Class {
	
	public static void main(String[] args) {
		int[] myArray= {7,0,9,8,4,3};
		Arrays.sort(myArray);
		
		System.out.println(myArray[0]);
		List l = Arrays.asList(myArray);
		System.out.println(l.get(1));
		
	}
}
