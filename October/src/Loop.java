
public class Loop {
	public static void main(String[] args) {
		int j=0;
		for(int i=0;i<3;i++) {
			for(;j<4;j++) {
				if(j<1) {
					System.out.println("hello");
					break;
					}
			}
			System.out.println("bye");
			
		}
	}
}
