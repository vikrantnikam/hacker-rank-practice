package algorithms.warmup;

import java.io.IOException;
import java.util.Scanner;

public class VeryBigSum {

	/*
	 * Complete the aVeryBigSum function below.
	 */
	static long aVeryBigSum(int n, long[] ar) {
		/*
		 * Write your code here.
		 */
		long sum = 0;
		for (long a : ar) {
			sum += a;
		}
		return sum;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = Integer.parseInt(scan.nextLine().trim());

		long[] ar = new long[n];

		String[] arItems = scan.nextLine().split(" ");

		for (int arItr = 0; arItr < n; arItr++) {
			long arItem = Long.parseLong(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		long result = aVeryBigSum(n, ar);

		System.out.println(result);

		scan.close();
	}
}
