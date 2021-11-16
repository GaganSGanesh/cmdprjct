package Pack2;

import java.io.File;
import java.io.IOException;

public class Path_Specified_Exist_or_Not {
	public static void main(String[] args) throws IOException {
		File f=new File("E:/Project/m.txt");
		System.out.println(f.exists());
		
		File f1=new File("F:\\The Witcher\\S1\\New folder");
		System.out.println(f.exists());
		
		File f2=new File("F:\\The Witcher\\S1\\New folder\\Milu");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		
		File f3=new File("F:\\The Witcher\\S1\\New folder\\Milu\\Nilu");//can't make file inside Milu
		f3.createNewFile();
		System.out.println(f2.exists());
		
	}
}
