package Pack1;
import java.io.File;
import java.io.IOException;

public class Night1_47 {
public static void main(String[] args) throws IOException {
	File f=new File("def.txt");
	System.out.println(f.exists());
	System.out.println(f);
	f.createNewFile();
	System.out.println(f.exists());
	System.out.println(f.getPath());
}
}
