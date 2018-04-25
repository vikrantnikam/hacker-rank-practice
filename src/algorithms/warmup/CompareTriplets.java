package algorithms.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CompareTriplets {

	/*
	 * Complete the solve function below.
	 */
	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int[] aArr = new int[] { a0, a1, a2 };
		int[] bArr = new int[] { b0, b1, b2 };
		int alicePts = 0;
		int bobPts = 0;
		for (int i = 0; i < 3; i++) {
			if (aArr[i] >= 1 && bArr[i] >= 1 && aArr[i] <= 100 && bArr[i] <= 100) {
				if (aArr[i] > bArr[i]) {
					alicePts = alicePts + 1;
				} else if (aArr[i] < bArr[i]) {
					bobPts = bobPts + 1;
				}
			}
		}
		// int pointsAlice = ((a0>b0)?1:0)+ ((a1>b1)?1:0)+ ((a2>b2)?1:0) ;
		// int pointsBob = ((a0<b0)?1:0)+ ((a1<b1)?1:0)+ ((a2<b2)?1:0) ;
		// System.out.println(pointsAlice+" " +pointsBob);
		return new int[] { alicePts, bobPts };
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] a0A1A2 = scan.nextLine().split(" ");

		int a0 = Integer.parseInt(a0A1A2[0].trim());

		int a1 = Integer.parseInt(a0A1A2[1].trim());

		int a2 = Integer.parseInt(a0A1A2[2].trim());

		String[] b0B1B2 = scan.nextLine().split(" ");

		int b0 = Integer.parseInt(b0B1B2[0].trim());

		int b1 = Integer.parseInt(b0B1B2[1].trim());

		int b2 = Integer.parseInt(b0B1B2[2].trim());

		int[] result = solve(a0, a1, a2, b0, b1, b2);

		for (int resultItr = 0; resultItr < result.length; resultItr++) {
			bw.write(String.valueOf(result[resultItr]));

			if (resultItr != result.length - 1) {
				bw.write(" ");
			}
		}

		bw.newLine();

		bw.close();
	}
}
