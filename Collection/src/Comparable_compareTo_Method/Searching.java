package Comparable_compareTo_Method;
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	Scanner s=new Scanner(System.in);
	System.out.println("enter a key to search");
	int key=s.nextInt();
	int found=0;
	boolean present=false;
	for(int i=0;i<a.size();i++) {
		if((Integer)a.get(i)==key)
		{
			System.out.println("key is present at index"+i);
			present=true;
			found=1;
			break;
		}
	}
		if(!present)
		{
			System.out.println("key is not present");
		}
	if(found==0)
		System.out.println("not found");
}
}
