package Array_Programs;

import java.util.Arrays;

public class ShiftAll_Zeroes_To_Last_Index {

	public static void main(String[] args) {
		int[] a= {1,0,2,0,3,0,0,4};
		int[] b=new int[a.length];
		int j=0;
		for (int i : a) {
			if(i!=0) {
				b[j]=i;
				j++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
