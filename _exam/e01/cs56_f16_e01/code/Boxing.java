import java.util.ArrayList;

class Boxing {

	public static void main(String [] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(9);
		mylist.add(new Integer(3));
		mylist.add(mylist.get(0) + 1);
		int x = mylist.get(0);
		Integer y = mylist.get(1);
		System.out.println("x=" + x + " y=" + y);
	}
}