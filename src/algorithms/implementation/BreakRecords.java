package algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class BreakRecords {

	/*
	 * Complete the breakingRecords function below.
	 */
	static int[] breakingRecords(int[] scores) {
		/*
		 * Write your code here.
		 */
		int[] output = new int[2];
		int max_score = scores[0];
		int min_score = scores[0];

		for (int score : scores) {
			if (score > max_score) {
				max_score = score;
				output[0]++;
			}
			if (score < min_score) {
				min_score = score;
				output[1]++;
			}
		}
		return output;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bw = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[] score = new int[n];

		String[] scoreItems = scan.nextLine().split(" ");

		for (int scoreItr = 0; scoreItr < n; scoreItr++) {
			int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
			score[scoreItr] = scoreItem;
		}

		int[] result = breakingRecords(score);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			// bw.write(String.valueOf(result[resultItr]));
			System.out.println(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				// bw.write(" ");
				System.out.println(" ");
			}
		}

		// bw.newLine();

		// bw.close();
	}
}
