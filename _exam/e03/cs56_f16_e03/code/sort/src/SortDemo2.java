import java.util.ArrayList;
import java.util.Collections;
public class SortDemo2 {

    public static ArrayList<Integer> toArrayList(int [] array) {
	ArrayList<Integer> retval = new ArrayList<Integer>();
	for (int val: array) {
	    retval.add(val);
	}
	return retval;
    }

    
    public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> factorizations =
	    new ArrayList<ArrayList<Integer>>();
	
	factorizations.add(arrayToArrayList(new int [] {3,3,5})); // 45
		factorizations.add(arrayToArrayList(new int [] {2,2,2,2,2})); // factors of 32
		factorizations.add(arrayToArrayList(new int [] {3,29}));    // factors of 87
		factorizations.add(arrayToArrayList(new int [] {2,2,3}));  // factors of 12
		factorizations.add(arrayToArrayList(new int [] {2,2,23})); // factors of 92
		factorizations.add(arrayToArrayList(new int [] {2,2,2,2})); // factors of 16
		// Collections.sort(factorizations);
		System.out.println("factorizations=" + factorizations);
	}
}
