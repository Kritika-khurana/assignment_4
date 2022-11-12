import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program which will accept List of String and produce another List of
		// string of which will have only values which starts with git
		// Input – Git, Github, GitLab,GitBash, Selenium, Java, Maven
		// Output- Git, Github, Gitlab, GitBash

		List<String> Str = new ArrayList<String>(
				Arrays.asList("Git", "Github", "GitLab", "GitBash", "Selenium", "Java", "Maven"));
		List<String> newList = new ArrayList<String>();
		for (int i = 0; i < Str.size(); i++) {

			if (Str.get(i).startsWith("Git")) {

				newList.add(Str.get(i));

			}

		}
		System.out.println(newList);
	}
}
