package October;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class write {
	public static void main(String[] args) throws IOException {
//		FileWriter fw=new FileWriter("./data/file.txt");//create new file if not present 
//		fw.write("\nThis is planet earth");
//		fw.flush();
//		fw.close();
//=========================================
		BufferedWriter bw=new BufferedWriter(new FileWriter("./data/file.txt"));
		bw.write("This Is Planet Earth");
		bw.newLine();
		bw.write("Of Solar System");
		bw.flush();
		bw.close();
	}
}
