import java.util.ArrayList;

public class DemoArrayList {
	public static void main(String args []) {
		ArrayList<String> fruits = new ArrayList<String>();
		
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

