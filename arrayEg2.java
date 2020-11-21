public class arrayEg2 {
	public static void main ( String[] args ) {

		int[] valA = { 12, 23, 45, 56 };
		int[] valB; //= new int [4]; //way3

		//way2 
		valB = valA;
		//valA = valB; //SEMUA KOSONG

		//way1
		//valB[ 0 ] = valA [ 0 ] ;
		//valB[ 1 ] = valA [ 1 ];
		//valB[ 2 ] = valA [ 2 ] ;
		//valB[ 3 ] = valA [ 3 ] ;

		for (int i=0; i<valB.length; i++)
			System.out.println("Index " + i + " " + valB[i]);
		System.out.println("Size array is " + valB.length);



		//size array kekal 10
		//int [] data = {23, 38, 14, -3, 0, 14, 9, 103, 0, -56, 88}; //index 0 to 9

		//System.out.println("Size array is " + data.length);
		//System.out.println("Element index ke 10 = " + data[10]); //not error but exception



		//example 2
		//double[] val = new double[4]; //an array of double
		//val[0] = 0.12;
		//val[1] = 1.43;
		//val[2] = 2.98;

		//int j = 3;
		//System.out.println( val [ j ] );
		//System.out.println( val [ j - 1 ] );

		//j = j-2;
		//System.out.println( val [ j ]);
	}
}