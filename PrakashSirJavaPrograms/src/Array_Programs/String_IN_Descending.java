package Array_Programs;

public class String_IN_Descending {

	public static void main(String[] args) {

		String[] s= {"Hello","This","Is","b","Java","Program","a"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].compareTo(s[j])>0) {
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		for(String str:s) {
			System.out.print(str+" ");
		}
		
	

	}

}
