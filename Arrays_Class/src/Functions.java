import java.util.*;
public class Functions {
	public static void main(String[] args) {
		int[] a= {12,3,11,7,9,2,5};
		Arrays.sort(a);
		for(int i:a) {
			System.out.print(i+" ");
		}
		
//     AFTER DOING SORTING THEN ONLY WE CAN DO BINARY SEARCH
		
		System.out.println("\nindex at which number is present: "+Arrays.binarySearch(a,11));
		
       Arrays.fill(a,1);	
       for(int i:a) {
			System.out.print(i+" ");
		}
       
//     PRINTING ARRAY WITHOUT LOOP       
       
       System.out.println("\n"+Arrays.toString(a));
       
//     COMPARING TWO ARRAYS
       int[] b= {1, 1, 1, 1, 1, 1, 1};
       int[] c= {13,11,7,9,2};
       System.out.println(Arrays.equals(a,b));
       System.out.println(Arrays.equals(c,b));
       
	}
}
