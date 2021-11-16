package Blocks;
class Home{
	{
		System.out.println("this is instance block of Home class");   
	}
}
public class House extends Home{
	{	 
	System.out.println("this is instance block of House class");  
	} 
 House(String color,int floor)
 {
	 System.out.println("this is constructor of House class");
 }
 public static void main(String[] args) {
	House h=new House("red",7);	
}
}


