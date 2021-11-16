package NotRequired;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read_a_file_line_by_line_and_store_it_into_a_variable {
	public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
             while (strLine != null)
             {
                if (strLine == null)
                  break;
                str_data += strLine;
                strLine = br.readLine();
                
            }
              System.out.println(str_data);
             br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }
}
