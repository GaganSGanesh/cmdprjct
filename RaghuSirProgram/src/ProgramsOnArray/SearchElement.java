package ProgramsOnArray;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int[] a= {12,33,45,6,14,23,6};
		Scanner s=new Scanner(System.in);
		System.out.println("enter element to search");
		int key=s.nextInt();
		boolean temp=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==key) {
				System.out.println("number has been found at index:"+i);
				temp=true;
				break;
			}
		}
		if(!temp)
			System.out.println("number not found");
	}
}
