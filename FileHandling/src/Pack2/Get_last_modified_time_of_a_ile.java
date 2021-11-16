package Pack2;

import java.io.File;
import java.sql.Date;

public class Get_last_modified_time_of_a_ile {
	public static void main(String[] args) {
	       File file = new File("E:\\Project\\m.txt");
	       Date date=new Date(file.lastModified());
		   System.out.println("\nThe file was last modified on: "+date+"\n");	   
	     }
}
