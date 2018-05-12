package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoSets {

	/*
	 * Complete the getTotalX function below.
	 */
	static int getTotalX(int[] a, int[] b) {
		/*
		 * Write your code here.
		 */
		int lcm = a[0];
		for (int i = 1; i < a.length; i++) {
			lcm = lcm(lcm, a[i]);
		}
		int gcd = b[0];
		for (int j = 1; j < b.length; j++) {
			gcd = gcd(gcd, b[j]);
		}

		int count = 0;
		for (int m = lcm, n = 2; m <= gcd; m = lcm * n, n++) {
			if (gcd % m == 0) {
				count++;
			}
		}
		return count;

	}

	public static int lcm(int a, int b) {
		int lcm = (a * b) / gcd(a, b);
		return lcm;
	}

	public static int gcd(int a, int b) {
		int temp = 0;
		while (b != 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] nm = scan.nextLine().split(" ");

		int n = Integer.parseInt(nm[0].trim());

		int m = Integer.parseInt(nm[1].trim());

		int[] a = new int[n];

		String[] aItems = scan.nextLine().split(" ");

		for (int aItr = 0; aItr < n; aItr++) {
			int aItem = Integer.parseInt(aItems[aItr].trim());
			a[aItr] = aItem;
		}

		int[] b = new int[m];

		String[] bItems = scan.nextLine().split(" ");

		for (int bItr = 0; bItr < m; bItr++) {
			int bItem = Integer.parseInt(bItems[bItr].trim());
			b[bItr] = bItem;
		}

		int total = getTotalX(a, b);

		bw.write(String.valueOf(total));
		bw.newLine();

		bw.close();
	}
}
