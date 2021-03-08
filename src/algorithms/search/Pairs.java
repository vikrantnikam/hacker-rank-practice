package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

	static int pairs(int k, int[] arr) {
		int noOfPairs = 0;
		Arrays.sort(arr);
		// List<Integer> list =
		// Arrays.stream(arr).boxed().collect(Collectors.toList());
		// Collections.sort(list, Comparator.reverseOrder());
		// arr = list.stream().mapToInt(i -> i).toArray();

		/*
		 * int noOfPairs = 0; for (int i = 0 ; i < arr.length ; i++) { for (int
		 * j = 0 ; j < arr.length ; j++) { if (arr[i] - arr[j] == k){
		 * noOfPairs++; break; } } }
		 */

		int i = 0;
		int j = 1;
		while (j < arr.length) {
			int diff = arr[j] - arr[i];
			if (diff == k) {
				noOfPairs++;
				j++;
			} else if (diff > k) {
				i++;
				if (i == j) {
					j++;
				}
			} else if (diff < k) {
				j++;
			}
		}

		return noOfPairs;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int result = pairs(k, arr);
		System.out.println(result);
		in.close();
	}
}
