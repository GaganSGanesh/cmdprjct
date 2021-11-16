package Reverse_An_Array;

/*Reversing an array in Java can be done using the ‘reverse’ method present in the collections 
framework. But for this, you first need to convert an array to a list as the ‘reverse’ method 
takes the list as an argument.

The following program reverses an array using the ‘reverse’ method. */

import java.util.*; 
 
public class Convert_To_List { 
 
    /*function reverses the elements of the array*/
	/*
	 * static void reverse(Integer myArray[]) {
	 * Collections.reverse(Arrays.asList(myArray));
	 * System.out.println("Reversed Array:" + Arrays.asList(myArray)); }
	 */
     public static void main(String[] args) 
    { 
        Integer [] myArray = {1,3,5,7,9}; 
        System.out.println("Original Array:" + Arrays.asList(myArray));
     //   reverse(myArray); 
        List l = Arrays.asList(myArray);
        Collections.reverse(l);
        System.out.println("Reverse of the Array is:"+l);
    } 
}


/*int[] arr = { 1, 2, 3, 4, 5 };
int start = 0;
int end = arr.length - 1;

while (start < end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}

Assert.assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, arr);*/