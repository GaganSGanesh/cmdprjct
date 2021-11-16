
public class Multiply
{
	    public static void main(String s[])
	    {
	        double[] input = {2.0, 3.1, 4.3, 7.5, 6.2, 1.0};
	        double[] output = multiplyEveryElement(input);
	        System.out.print("Result after multiplying by 6.0 is : ");
	        for(double outputElement : output)
	        {
	            System.out.print(outputElement + ", ");
	        }
	 
	    }
	    public static double[] multiplyEveryElement(double[] input)
	    {
	        double[] result = null;
	        result=new  double[input.length] ;
	        int count=0;
	        for(double i:input)
	        {
	            result[count]=6.0*i;
	            count++;
	        }
	 
	        return result;
	    }
	}
	

