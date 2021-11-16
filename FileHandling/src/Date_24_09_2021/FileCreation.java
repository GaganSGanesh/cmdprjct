package Date_24_09_2021;

import java.io.*;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f=new File("sun.txt");
//		System.out.println(f.exists());
//		System.out.println(f.createNewFile());
//		System.out.println(f.getPath());

//=================================================		

//		FileWriter fw=new FileWriter(f);   //deleting previous data and write new data
//		String s="o bhai maro mujhe maro";
//		fw.write(s);
//		fw.close();//close the writer
		
//over riding previous data with new data		
//		FileWriter fw1=new FileWriter(f);
//		fw1.write("\n");
//		fw1.write(98);
//		fw1.close();
//		fw1.write(98); it will not work because we have closed the writer
		
//appending data
//		FileWriter fw2=new FileWriter(f,true);
//		String s1="\nbangalore";
//		fw2.write(s1);
//		fw2.close();
		
//============================================
		
//Reading the data from file		
//		FileReader fr=new FileReader(f);
//		int i=fr.read();
//		while(i!=-1) {
//			System.out.print((char)i);
//			i=fr.read();
//			}

//==========================================

//		System.out.println("\n");
//			FileReader fr1=new FileReader(f);
//			int j=fr1.read();
//			while(j!=-1) {
//				System.out.print((char)j);
//				j=fr1.read();
//			}

	}	
}







