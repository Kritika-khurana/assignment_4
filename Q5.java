import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a list which can accept another list as an element. List 1- 11,22,33
		 * List 2- 9,19,29 List 3- 7,17,27 Hint - ArrayList<ArrayList<Integer>> l1=new
		 * ArrayList<>();
		 */

		ArrayList<Integer> List1 = new ArrayList<Integer>(Arrays.asList(11, 22, 33));
		ArrayList<Integer> List2 = new ArrayList<Integer>();
		List2.add(9);
		List2.add(19);
		List2.add(29);
		ArrayList<Integer> List3 = new ArrayList<Integer>();
		List3.add(7);
		List3.add(17);
		List3.add(27);

		ArrayList<ArrayList<Integer>> List = new ArrayList<ArrayList<Integer>>();
		List.add(List1);
		List.add(List2);
		List.add(List3);

		System.out.println(List);

	}

}
