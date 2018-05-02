package algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MinMaxSum {

	/*
	 * Complete the miniMaxSum function below.
	 */
	static void miniMaxSum(int[] arr) {
		/*
		 * Write your code here.
		 */
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Long> sumList = new ArrayList<Long>();
		for (int i = 0; i < arr.length; i++) {
			list.remove(i);
			long sum = 0;
			for (Integer el : list) {
				sum += el;
			}
			sumList.add(sum);
			list.add(i, arr[i]);
		}

		System.out.println(Collections.min(sumList) + " " + Collections.max(sumList));

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = new int[5];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < 5; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		miniMaxSum(arr);
	}
}
