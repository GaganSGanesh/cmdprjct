package Array_Programs;

public class String_Of_Minimum_Length {
	public static void main(String[] args) {
		String[] s= {"Hello","This","Is","Java","Program","hi"};
		int l=s[0].length();
//		int index=0;
		for(int i=1;i<5;i++) {
			if(l>s[i].length()) {
				l=s[i].length();
//				index=i;
			}
		}
		for(String str:s) {
			if(str.length()==l) {
				System.out.println(str);
			}
		}
//		System.out.println(s[index]);
	}


}
