class CopyArray
{
    public static void main(String s[])
    {
        int[] input = {4, 6, 19, 2, 7, 12, 1, 9};
        int[] copy = copyArray(input);
        System.out.print("The copy of the array is : ");
        for(int element : copy)
        {
            System.out.print(element + ", ");
        }
 
    }
    public static int[] copyArray(int[] input)
    {
        int[] output = null;
        output=new int[input.length];
        int counter=0;
        for(int i:input)
        {
            output[counter]=i;
            counter++;
        }
        return output;
    }
}