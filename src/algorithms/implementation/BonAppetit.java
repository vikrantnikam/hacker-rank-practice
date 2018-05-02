package algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int sumExcludingItemK = 0;
		for (int i = 0; i < n; i++) {
			int val = in.nextInt();
			if (val >= 1 && val <= 10000) {
				if (i != k) {
					sumExcludingItemK += val;
				}
			}
		}
		int b = in.nextInt();
		System.out.println((sumExcludingItemK / 2) == b ? "Bon Appetit" : b - (sumExcludingItemK / 2));
		in.close();

	}
}
