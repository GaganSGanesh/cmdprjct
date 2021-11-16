package Date_28_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Counts_Words_in_File {
	public static void main(String[] args) throws IOException {
		File f=new File("./data/name.txt");
		FileReader fr=new FileReader(f);
		String s="";
		int i=0;
		while(i!=-1) {
		i=fr.read();
		s=s+(char)i;
//		System.out.print((char)i);
		}
//		System.out.println(s);
		String[] array = s.split(" ");
		int count=0;
		int word=0;
		for (String string : array) {
			word++;
			if(string.equalsIgnoreCase("java"))
				count++;
		}
		System.out.println("no. of word present in text file is "+word);
		System.out.println("no. of java present in text file is "+count);
		
	}
}
