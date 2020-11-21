import java.util.Vector;

public class DemoVector {
	public static void main(String args []) {
		Vector<String> fruits = new Vector<String>();
		
		fruits.add("rambutan");
		fruits.add ("jackfruit");
		fruits.add("mangoesteen");

		System.out.println(fruits);

		//fruits.remove("jackfruit");
		fruits.add("mango");

		System.out.println(fruits);

		System.out.println("mangoesteen is exist? " + 
			fruits.contains("durian"));

		fruits.set(2, "durian");
		fruits.add(2, "durian2");
		System.out.println(fruits);
		System.out.println("Size : " + fruits.size());
	}

}

