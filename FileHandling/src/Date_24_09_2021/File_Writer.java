package Date_24_09_2021;

import java.io.*;

public class File_Writer {

	public static void main(String[] args) throws IOException {
//		FileWriter fw=new FileWriter("ghi.txt");//over ride
		FileWriter fw=new FileWriter("ghi.txt",true);
		String str="\napple believe in yourselef";
		fw.write(str);
		fw.close();	// if not closing the writer unable to write in the file
	}

}

class File_Reader{
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("ghi.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}
}