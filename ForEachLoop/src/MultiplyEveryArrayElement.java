class MultiplyEveryArrayElement
{
    public static void main(String s[])
    {
        int[] input = { 3, 5, 6, 7 };
        int[] output = multiplyEveryElement(input);
        System.out.print("Result of multiplying every element by 3 is : ");
        for(int outputElement : output)
        {
            System.out.print(outputElement + ", ");
        }
 
    }
    public static int[] multiplyEveryElement(int[] input)
    {
        int[] result = null;
        result = new int[input.length];
        int counter = 0;
        for (int i : input) {
            result[counter] =3*i;
            counter++;
        }
        return result;
    }
}