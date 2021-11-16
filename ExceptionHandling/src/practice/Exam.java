package practice;

public class Exam {
		public static int m() {
			
			try {
				System.out.println("try");
				System.out.println(10/0);
				return 2;
			}
			catch(ArithmeticException a) {
				System.out.println("catch");
				return 4;
			}
			finally {
				System.out.println("finally");
			}
//			System.out.println("program continues");
		}
		public static void main(String[] args) {
			System.out.println(m());
		}
		
}


