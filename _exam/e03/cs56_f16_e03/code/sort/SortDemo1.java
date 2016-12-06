import java.util.ArrayList;
import java.util.Collections;

public class SortDemo1 {

    public static ArrayList<Integer> toArrayList(int [] array) {
	ArrayList<Integer> retval = new ArrayList<Integer>();
	for (int val: array) {
	    retval.add(val);
	}
	return retval;
    }

    public static void main(String[] args) {
	ArrayList<Integer> nums =
	    toArrayList(new int [] {45,32,87,12,92,16});
	Collections.sort(nums);
	System.out.println("nums=" + nums);
    }
}
