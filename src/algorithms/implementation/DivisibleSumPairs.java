package algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	static int divisibleSumPairs(int n, int k, int[] ar) {
		// Complete this function
		int divisiblePairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if ((i < j) && (ar[i] + ar[j]) % k == 0) {
					divisiblePairs++;
				}
			}
		}
		return divisiblePairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
		in.close();
	}
}
