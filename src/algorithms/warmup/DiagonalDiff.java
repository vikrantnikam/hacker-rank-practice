package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalDiff {

	/*
	 * Complete the diagonalDifference function below.
	 */
	static int diagonalDifference(int[][] a) {
		/*
		 * Write your code here.
		 */
		int size = a[0].length;
		int sumDiagonal1 = 0;
		int sumDiagonal2 = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j) {
					sumDiagonal1 = sumDiagonal1 + a[i][j];
				}
			}
		}
		int k = size - 1;
		for (int i = 0; i < size; i++) {
			sumDiagonal2 = sumDiagonal2 + a[i][k];
			k--;
		}

		return Math.abs(sumDiagonal2 - sumDiagonal1);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}
