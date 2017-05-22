import java.util.ArrayList;
import java.util.Collections;
public class SortDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int [] values = new int [] {45,32,87,12,92,16};
		for (int i: values) { 
			nums.add(i); 
		}
		Collections.sort(nums);
		System.out.println("nums=" + nums);
	}
}