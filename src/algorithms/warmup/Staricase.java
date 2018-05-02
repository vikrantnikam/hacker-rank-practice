package algorithms.warmup;

import java.util.Scanner;

public class Staricase {

	/*
	 * Complete the staircase function below.
	 */
	static void staircase(int n) {
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			int j = 1;
			int spacecnt = n - i;
			while (j <= spacecnt) {
				sb.append(" ");
				j++;
			}
			j = 1;
			while (j <= i) {
				sb.append("#");
				j++;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		staircase(n);
	}
}
