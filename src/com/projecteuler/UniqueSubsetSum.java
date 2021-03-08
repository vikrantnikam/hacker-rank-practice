package com.projecteuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueSubsetSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		int len = arr.length;

		// Run a loop for printing all 2^n
		// subsets one by obe
		List<Integer> sumarr = new ArrayList<Integer>();
		for (int i = 0; i < (1 << len); i++) {
			// System.out.print("{ ");
			List<Integer> subarr = new ArrayList<Integer>();
			// Print current subset
			for (int j = 0; j < len; j++)

				// (1<<j) is a number with jth bit 1
				// so when we 'and' them with the
				// subset number we get which numbers
				// are present in the subset and which
				// are not
				if ((i & (1 << j)) > 0)
					subarr.add(arr[j]);
			// System.out.print(arr[j] + " ");

			if (subarr.size() == m) {
				int sum = 0;
				for (Integer k : subarr) {
					sum += k;
				}
				sumarr.add(sum);
			}
		}

		int finalSum = 0;

		for (int cnt = 0; cnt < sumarr.size(); cnt++) {
			if (sumarr.indexOf(sumarr.get(cnt)) == sumarr.lastIndexOf(sumarr.get(cnt))) {
				finalSum += sumarr.get(cnt);
			}
		}
		System.out.println(finalSum);

		in.close();
	}

}
