package algorithms.strings;

import java.util.Scanner;

public class HackerRank {

	static String hackerrankInString(String s) {
		String hacker = "hackerrank";
		int j = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (j < hacker.length() && s.charAt(i) == hacker.charAt(j)) {
				sb.append(s.charAt(i));
				j++;
			}
		}
		return sb.toString().equals(hacker) ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			String s = in.next();
			String result = hackerrankInString(s);
			System.out.println(result);
		}
		in.close();
	}
}
