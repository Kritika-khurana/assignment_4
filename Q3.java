import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program that will remove duplicate values from List
		// Input – Java, TestNG, Maven, Java,
		// Output – Java, TestNG, Maven
		// 2 methods
		// Method1
		List<String> TechA = new ArrayList<String>(Arrays.asList("Java", "TestNG", "Maven", "Java"));
		List<String> TechAWithoutDuplicate = TechA.stream().distinct().collect(Collectors.toList());
		System.out.println(TechAWithoutDuplicate);

		// Method 2 Using for loop

		List<String> Tech = new ArrayList<String>(Arrays.asList("Java", "TestNG", "Maven", "Java"));
		int k = 0;
		for (int i = Tech.size() - 1; i > 0; i--) {

			String l = Tech.get(k);
			if (l.equals(Tech.get(i))) {
				Tech.remove(i);
			}

			k++;

		}
		System.out.println(Tech);
	}

}
