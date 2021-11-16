package Comparable_compareTo_Method;

class Nilu{
	public static void main(String[] args) {
		
	}
	static void nilu(int[] j)//it takes the address of array object present in heap area 
	{						 //and change array there
		j[0]=1;
	}
}
class Chair {
	public static void main(String[] args) {
		int[] i= {3,6,2,6,7,0,9};
		Nilu m=new Nilu();
		Nilu.nilu(i);
		System.out.println(i[0]);
	}
}
