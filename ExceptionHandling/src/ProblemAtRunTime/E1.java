package ProblemAtRunTime;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E1 {
public static void main(String[] args) throws InterruptedException {
	System.out.println("main starts");
	Thread.sleep(1000);
	try
	{
		new FileOutputStream("c\\Migration.text");
//		System.out.println("Your file is created");
	}
	catch(FileNotFoundException f)
	{
		
	}
}
}
