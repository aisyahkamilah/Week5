//example1 passbyreference
class ArrayDemo1 { 
	public static void passByReference(String a[]) {
		a[0] ="Changed";
	}

	public static String passByValue(String a) {
		return a ="Changed again";
	}

	public static String [] getArray() {
		String a[] = {"Satu" , "Dua", "Tiga"};
		return a;
	}

	public static void main(String args[]) {

		String []b; //size x ditentukan lagi

		//size ditentukan oleh user input melalui scanner class

		b = getArray();
		for (String v : b)
		 	System.out.println(v);//pulangkan array

		System.out.println(b.length);

		//String []b={"Apple","Mango", "Orange"};
		// //System.out.println("Before Function Call "+b[0]);

		// for (String v : b)
		// 	System.out.println(v);
		// ArrayDemo1.passByReference(b);
		// //System.out.println("After Function Call "+b[0]);
			
		// System.out.println("The return value : " + ArrayDemo1.passByValue(b[0]));
		// System.out.println("The array : ");
		// for (String v : b)
		// 	System.out.println(v);

	}
}