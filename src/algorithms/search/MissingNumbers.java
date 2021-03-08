package algorithms.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MissingNumbers {

	static int[] missingNumbers(int[] arr, int[] brr) {
		List<Integer> arrlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> brrlist = Arrays.stream(brr).boxed().collect(Collectors.toList());
		List<Integer> missingNumberList = new ArrayList<Integer>();
		List<Integer> distinctElements = brrlist.stream().distinct().collect(Collectors.toList());
		for (Integer b_val : distinctElements) {
			if (!missingNumberList.contains(b_val)) {
				if (Collections.frequency(brrlist, b_val) > Collections.frequency(arrlist, b_val)) {
					missingNumberList.add(b_val);
				}
			}
		}
		Collections.sort(missingNumberList);
		return missingNumberList.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int m = in.nextInt();
		int[] brr = new int[m];
		for (int brr_i = 0; brr_i < m; brr_i++) {
			brr[brr_i] = in.nextInt();
		}
		int[] result = missingNumbers(arr, brr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
