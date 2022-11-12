import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of values and print the second element, second last element.
		// Input – 10,45, 90,45, 23, 90, 44
		// Output – 45,90

		List<Integer> Numbers = new ArrayList<Integer>(Arrays.asList(10, 45, 90, 45, 23, 90, 44));
		System.out.println(Numbers.get(1));
		System.out.println(Numbers.get(Numbers.size() - 2));

	}

}
