package Pack2;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class Specific_files_by_extensions_from_specified_folder {	
	       public static void main(String a[])throws IOException{
	    	   
	        File file = new File("/home/students/");
	        file.createNewFile();
	           String[] list = file.list(new FilenameFilter() {
	           @Override
	            public boolean accept(File dir, String name) {
	             if(name.toLowerCase().endsWith(".py")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(String f:list){
	            System.out.println(f);
	        }
	    }
	}

