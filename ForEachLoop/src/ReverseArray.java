public class ReverseArray 
{
	public static void main(String[] args)
	{
		int[] input= {10,4,8,25,15};
		System.out.print("reverse of the given array is :");
		for(int i:input)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int[] output = reverse(input);
		for(int i:output)
		{
			System.out.print(i+" ");
		}
	}
	
	static int[] reverse(int[] input)
	{
		int[] result=new int[input.length];
		int counter=input.length-1;
		for(int i:input)
		{
			result[counter]=i;
			counter--;
		}
		return result;
	}
}
