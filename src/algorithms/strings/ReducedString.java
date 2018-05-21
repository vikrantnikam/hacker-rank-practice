package algorithms.strings;

import java.util.Scanner;

public class ReducedString {

	static String super_reduced_string(String str) {
		/*
		 * String[] strs = s.split("(?<=\\G.{2})"); StringBuffer sb = new
		 * StringBuffer(); for(String str: strs){ if(str.length() !=2 ||
		 * str.charAt(0) != str.charAt(1)) { sb.append(str); } } return
		 * sb.toString().equals("") ? "Empty String" : sb.toString();
		 */
		String reducedString = "Empty String";
		StringBuffer s = new StringBuffer(str);
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				s.delete(i - 1, i + 1);
				i = 0;
			}
		}
		if (s.length() != 0)
			reducedString = s.toString();
		return reducedString;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String result = super_reduced_string(s);
		System.out.println(result);
	}
}
