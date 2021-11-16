package Pack1;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample2 {
	static int i;
	static FileOutputStream fout;
	public static void main(String[] args) throws IOException{
		fout=new FileOutputStream("F:/Rupees.txt",true);
		String s="TATA";
		char ch[]=s.toCharArray();
		for(i=0;i<s.length();i++) {
			fout.write(ch[i]);
		}
		fout.close();
	}

}
