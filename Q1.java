import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create a list of String and print the values in reverse order
		// Input – Java, Selenium, TestNG, Git, Github
		// Output- Github, Git, TestNG, Selenium, Java

		List<String> Str = new ArrayList<String>(Arrays.asList("Java", "Selenium", "TestNG", "Git", "Github"));

		for (int i = 0; i < Str.size(); i++) {
			// System.out.println(Str.get(i));

			String p = Str.get((Str.size() - 1) - i); // 0=5; 1=4;2=3;3=3;4=1;
			String s = Str.get(i);
			s = p;

			System.out.println(s);
		}

	}

}
