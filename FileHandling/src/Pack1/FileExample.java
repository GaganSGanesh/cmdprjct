package Pack1;

import java.io.File;
import java.io.IOException;

public class FileExample {
public static void main(String[] args) throws IOException {
	File f=new File("F:/Money.txt");
	System.out.println("is exist: "+f.exists());
	File f1=new File("F:/Rupees.txt");
	f1.createNewFile();
	System.out.println("is exist: "+f1.exists());
	System.out.println("File size: "+f1.length());
}
}
