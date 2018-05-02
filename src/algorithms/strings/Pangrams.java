package algorithms.strings;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	/*
	 * Complete the pangrams function below.
	 */
	static String pangrams(String s) {
		s = s.trim().toLowerCase().replaceAll("\\s+", "");
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(new Character(s.charAt(i)));
		}
		return set.size() == 26 ? "pangram" : "not pangram";
		/*
		 * for(char c : str.toCharArray()){ if(str.indexOf(c) ==
		 * str.lastIndexOf(c)){ containsUnique = true; } else { containsUnique =
		 * false; }}
		 */
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = pangrams(s);

		System.out.println(result);
		scanner.close();
		//bufferedWriter.write(result);
		//bufferedWriter.newLine();

		//bufferedWriter.close();
	}
}
