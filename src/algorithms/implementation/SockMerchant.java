package algorithms.implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
		int noOfPairs = 0;

		List<Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
		List<Integer> distinctElements = list.stream().distinct().collect(Collectors.toList());
		for (Integer i : distinctElements) {
			int noOfElements = Collections.frequency(list, i);
			if (noOfElements / 2 > 0) {
				noOfPairs += noOfElements / 2;
			}
		}

		/*
		 * Set<Integer> colors = new HashSet<>(); int pairs = 0;
		 * 
		 * for (int i = 0; i < n; i++) { if (!colors.contains(ar[i])) {
		 * colors.add(ar[i]); } else { noOfPairs++; colors.remove(ar[i]); } }
		 */

		return noOfPairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
		in.close();
	}
}
