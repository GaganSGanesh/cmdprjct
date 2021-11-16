package SmartProgramming;

public class S3 {
public static void main(String[] args) {
	System.out.println(m());
}
static int m() {
	try {
		return 12;
		}
		catch(Exception e) {
			return 23;
		}
		finally {
			return 17;
		}
}
}