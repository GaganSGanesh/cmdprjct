package pack3;

import java.io.*;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws IOException {
		//creating file
		File f=new File("F:\\The Witcher\\S1\\New folder\\laptop.txt");
		System.out.println(f.exists());
		f.createNewFile();
		
		//writing into file
		FileWriter w=new FileWriter(f);
		w.write("\n I am from Earth ");
		w.close();
		
		//reading from file		
		//i. scanner 
			Scanner sc=new Scanner(f);
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
			sc.close();

			//ii.  FileReader
			 FileReader fr =new FileReader(f);
				  
				    int i;
				    while ((i=fr.read()) != -1)
				      System.out.print((char) i);

	    //iii.buffer reader
	}
}
