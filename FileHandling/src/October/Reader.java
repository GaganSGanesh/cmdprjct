package October;

import java.io.*;

public class Reader {
	public static void main(String[] args) throws IOException {
		File f=new File("./data/file.txt");
//		FileReader fr=new FileReader("./data/file.txt");
//		FileReader fr=new FileReader(f);
//		char[] c=new char[(int)f.length()];
//		fr.read(c);
//		for (char d : c) {
//			System.out.print(d);
//		}
//=========================================
		//using BufferReader
		FileReader fr=new FileReader("./data/file.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}

	}
}









