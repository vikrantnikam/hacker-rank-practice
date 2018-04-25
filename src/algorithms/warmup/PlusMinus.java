package algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {

	/*
	 * Complete the plusMinus function below.
	 */
	static void plusMinus(int[] arr) {
		/*
		 * Write your code here.
		 */
		float size = arr.length;
		float noOfPlus = 0;
		float noOfMinus = 0;
		float noOfZeros = 0;
		for (int a : arr) {
			if (a == 0) {
				noOfZeros++;
			} else if (a > 0) {
				noOfPlus++;
			} else {
				noOfMinus++;
			}
		}
		System.out.printf("%.6f %n", noOfPlus / size);
		System.out.printf("%.6f %n", noOfMinus / size);
		System.out.printf("%.6f %n", noOfZeros / size);

	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine().trim());

		int[] arr = new int[n];

		String[] arrItems = scan.nextLine().split(" ");

		for (int arrItr = 0; arrItr < n; arrItr++) {
			int arrItem = Integer.parseInt(arrItems[arrItr].trim());
			arr[arrItr] = arrItem;
		}

		plusMinus(arr);
	}
}
