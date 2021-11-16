package Pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CWH_File {
	public static void main(String[] args) {
	
//  code to create a new file
		
/*		File file=new File("cwhfile.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("unable to create this file");
			e.printStackTrace();
		}  

//  code to write to a file
	
		try {
			FileWriter filewriter=new FileWriter("cwhfile.txt");
			filewriter.write("this is my first file from cwh");
			filewriter.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
//	reading a file
	
		File file=new File("hello.txt");
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				String line=sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			
		}
*/
// deleting the file
		
		File myFile=new File("abc.txt");
		if(myFile.delete()) {
			System.out.println("i have deleted "+myFile.getName());
		}
		else
			System.out.println("some problem has occured while deleting file");
	}
}


