//array of object
public class ObjectArray {
	public static void main(String [] args) {
	Account obj[] = new Account[2] ; //declare and sediakan slot
	obj[0] = new Account(); //initialize object
	obj[1] = new Account();

	obj[0].setData(1,2);
	obj[1].setData(3,4);

	System.out.println("For Array Element 0 : ");
	obj[0].showData();
	System.out.println("For Array Element 1 : ");
	obj[1].showData();
    }
}