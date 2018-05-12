package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountValleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		char[] chars = s.toCharArray();
		int valley = 0;
		int level = 0;
		for (char c : chars) {
			if (c == 'D') {
				level--;
			}
			if (c == 'U') {
				level++;
			}
			if(level == 0 && c == 'U')
                ++valley;
		}

		return valley;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println(String.valueOf(result));
		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
