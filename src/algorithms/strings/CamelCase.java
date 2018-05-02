package algorithms.strings;

import java.util.Scanner;

public class CamelCase {

	static int camelcase(String s) {
		char[] chars = s.toCharArray();
		int noOfWords = 1;
		for (char c : chars) {
			if (Character.isUpperCase(c)) {
				noOfWords++;
			}
		}
		// noOfWords = s.length() - s.replaceAll("[A-Z]", "").length();
		return noOfWords;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int result = camelcase(s);
		System.out.println(result);
		in.close();
	}
}
