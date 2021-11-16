package October;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class file {
	public static void main(String[] args) throws IOException {	

        // Crate a directory inside another directory		

//		File f = new File("C:\\Users\\Biswajit\\eclipse-workspace\\FileHandling","data");
//		System.out.println(f.createNewFile()); // not works
//		System.out.println(f.mkdir());		
//=============================================================
        //create a text file inside a directory		
//		File f = new File(".","internet.txt"); also works
//		File f = new File("C:\\Users\\Biswajit\\eclipse-workspace\\FileHandling","internet.txt");
//		System.out.println(f.createNewFile()); 
		
//=================================================
		//check the file is directory or file
//		System.out.println(f.isFile()); 
//		System.out.println(f.isDirectory());
//=================================================		
		//list of all files and subdirectory present
		
		File f = new File("C:\\Users\\Biswajit\\eclipse-workspace\\FileHandling");
		String[] s = f.list();
//		for (String string : s) {
//			System.out.println(string);		
//			}
		
		for (String string : s) {
			File f1=new File(string);
			if(f1.isFile()) 
				System.out.println("file: "+string);
			else if(f1.isDirectory())
				System.out.println("dir: "+string);
		}
//=====================================================
		
		
	}
}
