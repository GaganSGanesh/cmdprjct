package Pack2;
import java.io.File;

public class Get_a_list_of_all_file_directory_names {
	 public static void main(String a[])
     {
//        File file = new File("/"); //inside c: or top of the directory folder it is showing
//        String[] fileList = file.list();
//        for(String name:fileList){
//            System.out.println(name);
//        }
        
        File f = new File("C:\\Users\\Biswajit");//inside Biswajit it is showing
        String[] fList = f.list();
        for(String name:fList){
        	System.out.println(name);
        }
    }
}
