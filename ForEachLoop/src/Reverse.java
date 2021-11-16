
public class Reverse {
	public static void main(String[] args) 
	{
		 int[] input = { 3, 5, 6, 7 };
		 int[] output=reverse(input);
		 System.out.print("Result of reverse of every element is: ");
	        for(int outputElement : output)
	        {
	            System.out.print(outputElement + ", ");
	        }
	}
	static int[] reverse(int[] input)
	{
		int[] result=null;			   //result=new result[input.length]; won't work
		result=new int[input.length];  //result[]=new int[input.length]; won't work
		int counter=input.length-1;
		for(int i:input)
		{
			result[counter]=i;
			counter--;
		}
		return result;
		
	}
}
