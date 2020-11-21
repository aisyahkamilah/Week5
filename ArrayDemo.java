public class ArrayDemo
{
	public static void main(String[] args )
	{
		//example 1
	    // declare & create an array of integers
		//int [] anArray = new int [10];

		// assign a value to each array element and print
		//array 1D size via array.length
		//for (int i = 0; i < anArray.length ; i ++)
			//{
				//anArray[i] = i;
				//System.out.print(anArray[i] + " ");
			//}
			//System.out.println();

		//2D array with 10 rows and 3 columns
		int [][] anArray = new int [10][3];
		System.out.println("Length ? " + anArray.length); //for row size
		System.out.println("Length ? " + anArray[0].length); //for column size //boleh any sub[0] tapi kena tengok size array

	}
}