package Reverse_An_Array;

	import java.util.*;
	 
		public class String_Array_To_List{
	 
	    /*function reverses the elements of the array*/
	    static void reverse(String myArray[])
	    {
	        Collections.reverse(Arrays.asList(myArray));
	        System.out.println("Reversed Array:" + Arrays.asList(myArray));
	    }
	 
	     public static void main(String[] args)
	    {
	        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
	        System.out.println("Original Array:" + Arrays.asList(myArray));
	        reverse(myArray);
	    }
	
}
	

//	The above program defines a string array. By converting it to the list and using the reverse 
//method on it, we reverse the array.

