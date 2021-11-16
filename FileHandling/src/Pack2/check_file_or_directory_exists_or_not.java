package Pack2;

import java.io.*;

public class check_file_or_directory_exists_or_not {
	 public static void main(String[] args) throws IOException {
	        // Create a File object
	        File my_file_dir = new File("/xyz.txt");
	        my_file_dir.createNewFile();
	         if (my_file_dir.exists()) 
	           {
	            System.out.println("The directory or file exists.\n");
	           } 
	         else
	          {
	            System.out.println("The directory or file does not exist.\n");
	          }
	       }
}
