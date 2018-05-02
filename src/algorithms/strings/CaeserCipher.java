package algorithms.strings;

import java.util.Scanner;

public class CaeserCipher {

	static String caesarCipher(String s, int k) {
		boolean constraint1 = s.contains(" ");
		boolean constraint2 = (0 <= k && k <= 100) ? true : false;
		if (!constraint1 && constraint2 && s.matches("\\A\\p{ASCII}*\\z")) {
			char[] alphabets = new char[100];
			char[] inputCharArray = s.toCharArray();
			int i = 0;
			for (char alpha : inputCharArray) {
				int asciiVal = (int) alpha;
				if (asciiVal <= 122 && asciiVal >= 97) {
					int newAsciiVal;
					if (((asciiVal + k) - 96) % 26 == 0) {
						newAsciiVal = 122;
					} else {
						newAsciiVal = ((asciiVal + k) - 96) % 26 + 96;
					}
					alphabets[i] = (char) newAsciiVal;
				} else if (asciiVal <= 90 && asciiVal >= 65) {
					int newAsciiVal;
					if (((asciiVal + k) - 64) % 26 == 0) {
						newAsciiVal = 90;
					} else {
						newAsciiVal = ((asciiVal + k) - 64) % 26 + 64;
					}
					alphabets[i] = (char) newAsciiVal;
				} else {
					alphabets[i] = (char) asciiVal;
				}
				i++;
			}
			String str = String.valueOf(alphabets);
			System.out.println(str);
		}

		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		String result = caesarCipher(s, k);
		System.out.println(result);
		in.close();
	}
}
