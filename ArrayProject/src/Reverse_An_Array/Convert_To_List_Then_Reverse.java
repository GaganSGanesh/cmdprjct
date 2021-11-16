package Reverse_An_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Convert_To_List_Then_Reverse {
	 public static void main(String[] args) 
	    { 
	        Integer [] myArray = {1,3,5,7,9}; 
	        
	        List<Integer> l = Arrays.asList(myArray);  //CONVERTING ARRAY TO LIST
	     
	        System.out.println("Original Array:" + l);

	        Collections.reverse(l);           //REVERSING LIST
	        
	        System.out.println("Reverse of the Array is:"+l);
	        
	         Object[] o=l.toArray();          //CONVERTING LIST TO ARRAY
	        
	        System.out.println(o[0]);
	    } 
}
