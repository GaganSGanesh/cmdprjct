package Pack2;

import java.io.*;

public class Check_if_file_or_directory_has_read_and_write_permission {
	public static void main(String[] args) throws IOException {

		File f=new File("E:\\JAVA\\pack1\\bin");
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		File f1=new File("C:\\");
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		
		File f2=new File("C:\\Milu.txt");
//		System.out.println(f2.createNewFile()); //create file explicitily implicitily not possible 
												//	in c folder
		System.out.println(f2);//print string
		
		try {
			FileWriter filewriter=new FileWriter("C:\\juju.txt");//we can't write inside c folder
			filewriter.write("konark wheel is older than entire America");
			filewriter.close();
		} 
		catch (IOException e) {
			System.out.println("there is problem writing into file");
			e.printStackTrace();
		}
	}
}
